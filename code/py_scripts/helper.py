import torch

import matplotlib.pyplot as plt

import numpy as np
import pandas as pd

import torch
import torchvision as thv
from torchvision.utils import make_grid
from torch.utils.data import DataLoader, Dataset
import torch.utils.data as data_utils

from transformers import RobertaTokenizer

from JCDataSet import JCDataSet
from DJCDataset import DJCDataSet

# Plot the provided Data
def plot_data(data: tuple, labels: tuple, updates: tuple, steps: tuple, x_label, y_label, title):
    """
    Plots given data with x and y labels in a line graph.
    :param labels: The label for each data
    :param data: The data to plot in a line graph. each index of tuple represents 1 data element
    :param updates: The x ticks
    :param x_label: X label
    :param y_label: Y label
    :param title: Title of the graph
    :return: None
    """

    fig, ax = plt.subplots(figsize=(12, 6))

    for dat, lab, step in zip(data, labels, steps):
        ls = np.dot(list(range(len(dat))) , step)
        print("Ls: " , ls)
        ax.plot(ls, dat, label=lab)

    ax.set_xlabel(x_label)
    ax.set_ylabel(y_label)
    ax.set_title(title)
    ax.legend()

class ToDeviceLoader:
    def __init__(self, data, device):
        self.data = data
        self.device = device

    def __iter__(self):
        for batch in self.data:
            yield to_device(batch, self.device)

    def __len__(self):
        return len(self.data)


def get_device():
    if torch.cuda.is_available():
        return torch.device("cuda")
    return torch.device("cpu")


# Useful when batching
def to_device(data, device):
    """
    Converts input data to input device
    :param data: Data to convert to passed in device
    :param device: The device to which we want to convert the data to
    :return: the converted data
    """
    if isinstance(data, (list, tuple)):
        return [to_device(x, device) for x in data]

    if hasattr(data, 'to') and callable(getattr(data, 'to')):
        return data.to(device, non_blocking=True)
    else:
        return data


def get_j_c_data_loaders(batch_size, code_tokenizer):
    """
    Derived from j_c_data_loader.ipynb notebook. Changes made there should be replicated here

    Args:
        batch_size (int): the batch size for loaders

    Returns:
        tuple: tuple containing pytorch dataloaders on CUDA -> (training, validation and test)
    """

    device = get_device()
    MAX_SEQ_LEN = 256

    train_df = pd.concat([pd.read_csv('../../datasets/train.java-cs.txt.cs', delimiter='\r', names=['cs_code']), 
    pd.read_csv('../../datasets/train.java-cs.txt.java', delimiter='\r', names=['j_code'])], axis=1)

    valid_df = pd.concat([pd.read_csv('../../datasets/valid.java-cs.txt.cs', delimiter='\r', names=['cs_code']),
    pd.read_csv('../../datasets/valid.java-cs.txt.java', delimiter='\r', names=['j_code'])], axis=1)

    test_df = pd.concat([pd.read_csv('../../datasets/test.java-cs.txt.cs', delimiter='\r', names=['cs_code']), 
    pd.read_csv('../../datasets/test.java-cs.txt.java', delimiter='\r', names=['j_code'])], axis=1)

    training_set = JCDataSet(train_df, code_tokenizer, MAX_SEQ_LEN, device)
    validation_set = JCDataSet(valid_df, code_tokenizer, MAX_SEQ_LEN, device)
    testing_set = JCDataSet(test_df, code_tokenizer, MAX_SEQ_LEN, device)

    train_dl = DataLoader(training_set, batch_size, num_workers=0, shuffle=False)
    val_dl = DataLoader(validation_set, batch_size, num_workers=0)
    test_dl = DataLoader(testing_set, batch_size, num_workers=0)

    return to_device(train_dl, device) , to_device(val_dl, device), to_device(test_dl, device)

def get_d_j_c_data_loaders(batch_size, code_tokenizer
, training_name='train.java-cs.txt.java'
, validation_name='valid.java-cs.txt.java'
, testing_name='test.java-cs.txt.java'
, shuffle_train_val= False):
    device = get_device()
    MAX_SEQ_LEN = 256
    datasetsPath = '../../datasets/'
    docName = ['train.doc.txt', 'valid.doc.txt' , 'test.doc.txt']

    train_df = pd.concat([pd.read_csv(datasetsPath + 'train.java-cs.txt.cs', delimiter='\r', names=['cs_code']), 
    pd.read_csv(datasetsPath + training_name, delimiter='\r', names=['j_code']),
    pd.read_csv(datasetsPath + docName[0], delimiter='\r', names=['doc'])], axis=1)

    valid_df = pd.concat([pd.read_csv(datasetsPath + 'valid.java-cs.txt.cs', delimiter='\r', names=['cs_code']),
    pd.read_csv(datasetsPath + validation_name, delimiter='\r', names=['j_code']),
    pd.read_csv(datasetsPath + docName[1], delimiter='\r', names=['doc'])], axis=1)

    test_df = pd.concat([pd.read_csv(datasetsPath + 'test.java-cs.txt.cs', delimiter='\r', names=['cs_code']), 
    pd.read_csv(datasetsPath + testing_name, delimiter='\r', names=['j_code']),
    pd.read_csv(datasetsPath + docName[2], delimiter='\r', names=['doc'])], axis=1)

    if shuffle_train_val:
        train_shape = train_df.shape[0]
        merged_df = pd.concat([train_df, valid_df]).reset_index().drop('index', axis=1)
        train_df = merged_df.sample(n=train_shape)
        valid_df = merged_df.drop(train_df.index).reset_index().drop('index', axis=1)
        train_df = train_df.reset_index().drop('index', axis=1)

    training_set = DJCDataSet(train_df, code_tokenizer, MAX_SEQ_LEN, device)
    validation_set = DJCDataSet(valid_df, code_tokenizer, MAX_SEQ_LEN, device)
    testing_set = DJCDataSet(test_df, code_tokenizer, MAX_SEQ_LEN, device)

    train_dl = DataLoader(training_set, batch_size, num_workers=0, shuffle=False)
    val_dl = DataLoader(validation_set, batch_size, num_workers=0)
    test_dl = DataLoader(testing_set, batch_size, num_workers=0)

    return to_device(train_dl, device) , to_device(val_dl, device), to_device(test_dl, device)
import torch
from torch.utils.data import Dataset

class DJCDataSet(Dataset):
    """
    Class defining the code dataset
    """
    def __init__(self, df, tokenizer, max_len, device):
        self.max_len = max_len
        self.tokenizer = tokenizer
        self.cs_code = df.cs_code
        self.j_code = df.j_code
        self.doc = df.doc
        self.device = device

    def __len__(self):
        return len(self.cs_code)

    def get_meaning(self, var, item, pre_label):
        text = self.tokenizer.tokenize(var[item])

        input = self.tokenizer.encode_plus(
            text,
            None,
            add_special_tokens=True,
            max_length=self.max_len,
            padding='max_length',
            truncation=True
        )
        return {
            # Ensure proper loss calulation by transformer (CodeT5)
            pre_label + "ids": torch.tensor(input['input_ids'], dtype=torch.long).to(self.device),
            pre_label + "mask": torch.tensor(input['attention_mask'], dtype=torch.long).to(self.device),
            pre_label + "unchanged": var[item]
           
        }

    def __getitem__(self, item):
        ret = self.get_meaning(self.cs_code, item, 'cs_')
        ret.update(self.get_meaning(self.j_code, item, 'j_'))
        ret.update(self.get_meaning(self.doc, item, 'doc_'))

        return ret

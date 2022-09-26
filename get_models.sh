mkdir -p models
mkdir -p models/doc2java
mkdir -p models/java2cs
mkdir -p models/java2doc
dirprefix='models/'
dirs="doc2java java2cs java2doc"
modelnames="translate_java_cs_codet5_base concode_codet5_base summarize_java_codet5_base"
for dir in $dirs
do
    fullprefix="$dirprefix$dir/"
    echo $fullprefix
    name="$fullprefix"config.json
    wget -O $name https://storage.googleapis.com/sfr-codet5-data-research/pretrained_models/codet5_base/config.json
done

MODEL_NAME=translate_java_cs_codet5_base && wget -O models/java2cs/pytorch_model.bin https://storage.googleapis.com/sfr-codet5-data-research/finetuned_models/${MODEL_NAME}.bin

MODEL_NAME=concode_codet5_base && wget -O models/doc2java/pytorch_model.bin https://storage.googleapis.com/sfr-codet5-data-research/finetuned_models/${MODEL_NAME}.bin

MODEL_NAME=summarize_java_codet5_base && wget -O models/java2doc/pytorch_model.bin https://storage.googleapis.com/sfr-codet5-data-research/finetuned_models/${MODEL_NAME}.bin

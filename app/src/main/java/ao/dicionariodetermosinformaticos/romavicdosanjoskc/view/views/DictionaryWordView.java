package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views;

import java.util.List;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel;

public interface DictionaryWordView {

    void onSuccessGetListWords(List<DictionaryWordModel> wordModelList);

    void onErrorGetListWords(String messageError);
}
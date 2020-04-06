package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel

interface DictionaryWordView {
    fun onSuccessGetListWords(wordModelList: List<DictionaryWordModel>)
    fun onErrorGetListWords(messageError: String?)
}
package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryModel

interface DictionaryView {
    fun onDictionarySuccess(wordModelList: MutableList<DictionaryModel>)
    fun onDictionaryError(messageError: String)
}
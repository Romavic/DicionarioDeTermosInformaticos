package ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.ListMeannig
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views.DictionaryWordView

class DictionaryWordPresenter(private val dictionaryWordView: DictionaryWordView) {

    fun dictionaryWord() {
        if (ListMeannig.listAllMeannig().isNotEmpty()) {
            dictionaryWordView.onSuccessGetListWords(ListMeannig.listAllMeannig())
        } else {
            dictionaryWordView.onErrorGetListWords("Erro ao carregar dados")
        }
    }
}
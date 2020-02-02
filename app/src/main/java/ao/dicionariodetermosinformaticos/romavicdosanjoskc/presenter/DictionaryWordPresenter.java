package ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.ListMeannig;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views.DictionaryWordView;

public class DictionaryWordPresenter {

    private DictionaryWordView dictionaryWordView;

    public DictionaryWordPresenter(DictionaryWordView dictionaryWordView) {
        this.dictionaryWordView = dictionaryWordView;
    }

    public void getDictionaryWord() {
        if (!ListMeannig.ListAllMeannig().isEmpty()) {
            dictionaryWordView.onSuccessGetListWords(ListMeannig.ListAllMeannig());
        } else {
            dictionaryWordView.onErrorGetListWords("Erro ao carregar dados");
        }
    }
}

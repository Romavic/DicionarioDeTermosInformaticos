package com.NFA.DicionarioDeTermosInformaticos.interfaces;

import com.NFA.DicionarioDeTermosInformaticos.models.Model_Dictionary_Words;

import java.util.List;

public interface MainView {

    void showLoading();
    void hideLoading();
    void onGetResults(List<Model_Dictionary_Words> notes);
    void onErrorLoading(String message);
}

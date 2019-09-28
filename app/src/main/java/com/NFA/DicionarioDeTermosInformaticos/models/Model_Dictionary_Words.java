package com.NFA.DicionarioDeTermosInformaticos.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model_Dictionary_Words {

    @Expose
    @SerializedName("title")private String title;
    @Expose
    @SerializedName("meaning")private String meaning;
    @Expose
    @SerializedName("image")private String image;

    public Model_Dictionary_Words() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}

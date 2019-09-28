package com.NFA.DicionarioDeTermosInformaticos.api;

import com.NFA.DicionarioDeTermosInformaticos.models.Model_Dictionary_Words;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("getArray.php")
    Call<List<Model_Dictionary_Words>> getNotes();

}

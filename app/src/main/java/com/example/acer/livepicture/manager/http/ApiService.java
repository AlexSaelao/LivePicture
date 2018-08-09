package com.example.acer.livepicture.manager.http;

import com.example.acer.livepicture.dao.PhotoItemCollectionDao;
import com.example.acer.livepicture.manager.PhotoListManager;
import com.example.acer.livepicture.view.PhotoListItem;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by acer on 1/26/2018.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

}

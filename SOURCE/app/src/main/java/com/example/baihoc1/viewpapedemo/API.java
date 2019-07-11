package com.example.baihoc1.viewpapedemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    @POST("Service/GetListFollow")
    Call<ResponseBody> getListFollow (@Body Object object);
}

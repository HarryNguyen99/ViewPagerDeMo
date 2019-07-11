package com.example.baihoc1.viewpapedemo.Controler;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {
    @POST("Service/GetPriceListMaterialFollow")
    Call<ResponseBody> getPriceListMaterialFollow (@Body Object object);
}

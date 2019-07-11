package com.example.baihoc1.viewpapedemo.Controler;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baihoc1.viewpapedemo.Controler.Adapter.FollowAdapter;
import com.example.baihoc1.viewpapedemo.Model.Follow;
import com.example.baihoc1.viewpapedemo.R;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class FollowFragment extends Fragment {
    RecyclerView rvFollow;
    View vRoot;


    public FollowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vRoot = inflater.inflate(R.layout.fragment_follow, container, false);
        init();
        getdata();
        return vRoot;
    }

    private void init() {
        rvFollow = vRoot.findViewById(R.id.rv_follow);

    }

    private void getdata() {
        GetListFollow getListFollow = new GetListFollow("28B1-0001","",1);
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://winds.hopto.org:8789/api/")
                .build();
        retrofit.create(Api.class).getPriceListMaterialFollow(getListFollow)
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                      //  Log.d("ok","ok");
                        String strJson = null;
                        try {
                            strJson = response.body().string();
                            Gson gson = new Gson();
                            Follow follow = gson.fromJson(strJson,Follow.class);
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                                    LinearLayoutManager.VERTICAL,false);
                            rvFollow.setLayoutManager(linearLayoutManager);
                            FollowAdapter adapter = new FollowAdapter();



                        }catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                      //  Log.d("no","no");
                    }
                });
    }

    class GetListFollow {
        int Page;
        String SearchKey, BikeID;

        public GetListFollow (String BikeID, String SearchKey, int Page) {
            this.BikeID = BikeID;
            this.Page = Page;
            this.SearchKey = SearchKey;
        }


    }


}

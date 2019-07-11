package com.example.baihoc1.viewpapedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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
        GetListFollow getListFollow = new GetListFollow("99F1-1354","",0);

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

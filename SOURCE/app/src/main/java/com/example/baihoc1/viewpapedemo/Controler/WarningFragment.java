package com.example.baihoc1.viewpapedemo.Controler;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baihoc1.viewpapedemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WarningFragment extends Fragment {


    public WarningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_warning, container, false);
    }

}

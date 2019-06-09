package com.example.uisummeri;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {




@Nullable
    @Override
   public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, Bundle savedInstanceState){
//return  inflater.inflate(R.layout.blank_fragment, container,false);
    View view = inflater.inflate(R.layout.blank_fragment, container, false);

    return view;
    }

//
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    }

}

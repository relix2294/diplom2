package com.ayni__22gmail.diplom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.app.Fragment;

public class settings extends Fragment {
    View rootView;
    @Nullable
    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView=inflater.inflate(R.layout.settings,container,false);
        return rootView;
    }
}

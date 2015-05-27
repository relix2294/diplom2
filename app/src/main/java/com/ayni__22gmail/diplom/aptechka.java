package com.ayni__22gmail.diplom;
import android.support.v4.app.Fragment;
//import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class aptechka extends Fragment {
    View rootView;
    @Nullable
    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView=inflater.inflate(R.layout.aptechka,container,false);
        return rootView;
    }
}

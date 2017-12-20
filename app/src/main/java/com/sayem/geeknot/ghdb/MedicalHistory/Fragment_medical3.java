package com.sayem.geeknot.ghdb.MedicalHistory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sayem.geeknot.ghdb.R;

/**
 * Created by Sayem on 12/15/2017.
 */

public class Fragment_medical3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_medical3,container,false);

        return rootView;
    }
    @Override
    public String toString() {
        String title="MAJOR ILLNESSES";
        return title;
    }
}

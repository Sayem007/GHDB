package com.sayem.geeknot.ghdb.AuthorizationForRelease;

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

public class Fragment_release1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_release1,container,false);

        return rootView;
    }
    @Override
    public String toString() {
        String title="Step 1";
        return title;
    }
}

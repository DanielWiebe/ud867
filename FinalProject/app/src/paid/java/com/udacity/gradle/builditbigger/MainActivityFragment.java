package com.udacity.gradle.builditbigger;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {


     public MainActivityFragment() {
          // Required empty public constructor
     }


     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

          View rootView = inflater.inflate(R.layout.fragment_main, container, false);
          return rootView;
     }

}

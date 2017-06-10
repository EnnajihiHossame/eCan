package fr.utbm.gl52.androidapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.utbm.gl52.androidapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UrgenceFragment extends Fragment {


    public UrgenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_urgence, container, false);
        return view;
    }

}

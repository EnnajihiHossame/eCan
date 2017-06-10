package fr.utbm.gl52.androidapp.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

import fr.utbm.gl52.androidapp.Adapters.CustomAdapter;
import fr.utbm.gl52.androidapp.Models.HistoryListModel;
import fr.utbm.gl52.androidapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArrayList<HistoryListModel> mDataset;
    protected View view;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashaboard, container, false);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        initDataSet();
        mRecyclerView = (RecyclerView) view.findViewById(R.id.myrecyclerView);
        mAdapter = new CustomAdapter(mDataset);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    protected void initDataSet(){
        mDataset = new ArrayList<HistoryListModel>();
        mDataset.add(new HistoryListModel("06/06/2017", Calendar.getInstance(),"00:28:07", "4.2 km", "102 bpm", "06:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
        mDataset.add(new HistoryListModel("04/06/2017", Calendar.getInstance(),"01:03:07", "7.6 km", "126 bpm", "05:02 min/km"));
    }
}

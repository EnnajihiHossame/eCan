package fr.utbm.gl52.androidapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import fr.utbm.gl52.androidapp.Adapters.CustomAdapter;
import fr.utbm.gl52.androidapp.Models.HistoryListModel;


public class DB2Activity extends AppCompatActivity {

    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    //protected String[] mDataset;
    protected ArrayList<HistoryListModel> mDataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initDataSet();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new CustomAdapter(mDataset);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy: MM : dd");
        String date = df.format(calendar.getTime());


        Log.d("AA", String.valueOf(DateUtils.formatDateTime(this, calendar.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_YEAR)));

        Log.d("AA", String.valueOf(calendar.get(Calendar.DATE)));
        Log.d("AA", String.valueOf(date));

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

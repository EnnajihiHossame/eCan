package fr.utbm.gl52.androidapp.Models;

import java.util.Calendar;

/**
 * Created by ennajihihoussame on 06/06/2017.
 */

public class HistoryListModel {


    String date;
    Calendar calendar;
    String duration;
    String distance;
    String hr;
    String pace;

    public HistoryListModel(String date,Calendar calendar, String duration, String distance, String hr, String pace ) {
        this.date=date;
        this.calendar=calendar;
        this.duration=duration;
        this.distance=distance;
        this.hr=hr;
        this.pace=pace;

    }
    public String getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }

    public String getDistance() {
        return distance;
    }

    public String getHr() {
        return hr;
    }

    public String getPace() {
        return pace;
    }


}
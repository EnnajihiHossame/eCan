package fr.utbm.gl52.androidapp.Adapters;

/**
 * Created by ennajihihoussame on 05/06/2017.
 */



import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import fr.utbm.gl52.androidapp.Models.HistoryListModel;
import fr.utbm.gl52.androidapp.R;


/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private String[] mDataSet;
    private ArrayList<HistoryListModel> TDataSet;

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView date;
        private final TextView duration;
        private final TextView distance;
        private final TextView hr;
        private final TextView pace;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                }
            });
            date = (TextView) v.findViewById(R.id.history_row_date);
            duration = (TextView) v.findViewById(R.id.history_row_duration);
            distance = (TextView) v.findViewById(R.id.history_row_distance);
            hr = (TextView) v.findViewById(R.id.history_row_hr);
            pace = (TextView) v.findViewById(R.id.history_row_pace);

        }

        public TextView getDate() {
            return date;
        }

        public TextView getDuration() {
            return duration;
        }

        public TextView getDistance() {
            return distance;
        }

        public TextView getHr() {
            return hr;
        }

        public TextView getPace() {
            return pace;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomAdapter(ArrayList<HistoryListModel> dataSet) {
        TDataSet = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.history_row_view, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");
        HistoryListModel mHistoryModel = TDataSet.get(position);

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getDate().setText(mHistoryModel.getDate());
        viewHolder.getDuration().setText(mHistoryModel.getDuration());
        viewHolder.getDistance().setText(mHistoryModel.getDistance());
        viewHolder.getHr().setText(mHistoryModel.getHr());
        viewHolder.getPace().setText(mHistoryModel.getPace());
    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return TDataSet.size();
    }
}


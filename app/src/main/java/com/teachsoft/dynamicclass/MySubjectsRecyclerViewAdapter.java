package com.teachsoft.dynamicclass;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;

import java.util.List;

class MySubjectsRecyclerViewAdapter extends RecyclerView.Adapter<MySubjectsRecyclerViewAdapter.FlickrImageViewHolder> {
    private static final String TAG = "FlickrRecyclerViewAdapt";
    private List<Subject> mSubjectList;
    private Context mContext;

    public MySubjectsRecyclerViewAdapter(Context context, List<Subject> subjectList) {
        mContext = context;
        mSubjectList = subjectList;
    }

    @NonNull
    @Override
    public FlickrImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        Called by the layout manager when it needs a new view

        Log.d(TAG, "onCreateViewHolder: new view requested");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_my_subjects, parent, false);
        return new FlickrImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlickrImageViewHolder holder, int position) {
//      Called by the layout manager whn it wants new data in an existing row

        if ((mSubjectList == null) || (mSubjectList.size() == 0)){
//            holder.thumbnail.setImageResource(R.drawable.placeholder);
            holder.title.setText(R.string.empty_subjects_list);
        }
        else {
            Subject subjectItem = mSubjectList.get(position);
            Log.d(TAG, "onBindViewHolder: " + subjectItem.getTitle() + " --> " + position);

//            Picasso.get().load(subjectItem.getImage())
//                    .error(R.drawable.placeholder)
//                    .placeholder(R.drawable.placeholder)
//                    .into(holder.thumbnail);

//            holder.title.setText(subjectItem.getTitle());
            holder.title.setText("1");
        }
    }

    @Override
    public int getItemCount() {
//        Log.d(TAG, "getItemCount: called");
        return ((mSubjectList != null) && (mSubjectList.size() != 0) ? mSubjectList.size() : 1);
    }

    void loadNewData(List<Subject> newSubject) {
        mSubjectList = newSubject;
        notifyDataSetChanged();
    }

    public Subject getSubject(int position) {
        return ((mSubjectList != null) && (mSubjectList.size() != 0) ? mSubjectList.get(position) : null);
    }

    static class FlickrImageViewHolder extends RecyclerView.ViewHolder {
        private static final String TAG = "FlickrImageViewHolder";
        ImageView thumbnail = null;
        TextView title = null;

        public FlickrImageViewHolder(View itemView) {
            super(itemView);
            Log.d(TAG, "FlickrImageViewHolder: starts");
//            this.thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}


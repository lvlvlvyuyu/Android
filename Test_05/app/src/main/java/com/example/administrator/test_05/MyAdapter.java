package com.example.administrator.test_05;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/9.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private String[] mDataset;
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myview, parent, false);
        // set the view's size, margins, paddings and layout parameters

        RecyclerView.ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }
    //替换视图内容
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView =(TextView) itemView.findViewById(R.id.textView);

        }
    }
}

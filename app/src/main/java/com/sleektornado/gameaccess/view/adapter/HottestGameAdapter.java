package com.sleektornado.gameaccess;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rayhan on 04/04/18.
 */

public class HottestGameAdapter extends RecyclerView.Adapter<HottestGameAdapter.HottestGameViewHolder> {
    private List<HottestGameModel> mItems;
    private LayoutInflater inflater;

    public HottestGameAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<HottestGameModel> items){
        mItems = items;
    }

    @Override
    public HottestGameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = inflater.inflate(R.layout.adapter_hottest_games, parent, false);
        return new HottestGameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(HottestGameViewHolder holder, int position) {
//        HottestGameModel current = mItems.get(position);
        holder.title.setText("ahay");
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class HottestGameViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;

        public HottestGameViewHolder(View itemView, HottestGameAdapter adapter)
        {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.text_title);
        }


        @Override
        public void onClick(View v) {
            getAdapterPosition();
        }


    }
}

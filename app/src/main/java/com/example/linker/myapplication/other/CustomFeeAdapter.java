package com.example.linker.myapplication.other;

/**
 * Created by linker on 6/5/18.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.linker.myapplication.R;
import com.example.linker.myapplication.model.Fee;

import java.util.ArrayList;
import java.util.List;

public class CustomFeeAdapter extends RecyclerView.Adapter<CustomFeeAdapter.MyViewHolder> {

    private List<Fee> dataSet;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtAmount;
        TextView txtDate;
        TextView txtDesc;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.txtAmount = (TextView) itemView.findViewById(R.id.txt_fee_amount);
            this.txtDate = (TextView) itemView.findViewById(R.id.txt_fee_date);
            this.txtDesc = (TextView) itemView.findViewById(R.id.txt_fee_desc);
        }
    }

    public CustomFeeAdapter(List<Fee> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fee_card_layout, parent, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int listPosition) {

        TextView txtAmount = holder.txtAmount;
        TextView txtDate = holder.txtDate;
        TextView txtDesc = holder.txtDesc;

//        Log.e("List in Adapter", dataSet.toString());
        Fee fee = dataSet.get(listPosition);
        txtAmount.setText(String.valueOf(fee.getAmount()));
        txtDate.setText(fee.getPaymentDate());
        txtDesc.setText(fee.getPaymentDesc());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
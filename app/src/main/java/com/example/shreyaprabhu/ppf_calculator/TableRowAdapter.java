package com.example.shreyaprabhu.ppf_calculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shreya Prabhu on 6/22/2016.
 */
public class TableRowAdapter extends RecyclerView.Adapter<TableRowAdapter.RowViewHolder> {



    private ArrayList<TableRowModels> tableRowList = new ArrayList<>();
    private static Context mContext;

    public class RowViewHolder extends RecyclerView.ViewHolder {
        private TextView StartYear;
        private TextView OpeningBalance;
        private TextView AmountDeposited;
        private TextView InterestEarned;
        private TextView ClosingBalance;

        public RowViewHolder(View itemView) {
            super(itemView);
            StartYear = (TextView) itemView.findViewById(R.id.StartYear);
            OpeningBalance = (TextView) itemView.findViewById(R.id.OpeningBalance);
            AmountDeposited = (TextView) itemView.findViewById(R.id.AmountDeposited);
            InterestEarned = (TextView) itemView.findViewById(R.id.InterestEarned);
            ClosingBalance = (TextView) itemView.findViewById(R.id.ClosingBalance);

        }
    }

    public TableRowAdapter(Context context, ArrayList<TableRowModels> tableRowList) {
        super();
        mContext = context;
        this.tableRowList = tableRowList;
    }


    @Override
    public RowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new RowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RowViewHolder holder, int position) {

        TableRowModels tableRowModels = tableRowList.get(position);
        holder.StartYear.setText(String.valueOf(tableRowModels.getStartYear()));
        holder.OpeningBalance.setText(String.valueOf(tableRowModels.getOpeningBalance()));
        holder.AmountDeposited.setText(String.valueOf(tableRowModels.getAmountDeposited()));
        holder.InterestEarned.setText(String.valueOf(tableRowModels.getInterestEarned()));
        holder.ClosingBalance.setText(String.valueOf(tableRowModels.getClosingBalance()));

    }

    @Override
    public int getItemCount() {
        return tableRowList.size();
    }
}

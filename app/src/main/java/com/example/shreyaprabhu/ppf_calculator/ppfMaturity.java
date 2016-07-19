package com.example.shreyaprabhu.ppf_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class ppfMaturity extends AppCompatActivity {

    private final String TAG = ppfMaturity.class.getSimpleName();

    private int StartYear;
    private int OpeningBalance;
    private int AmountDeposited;
    private int InterestEarned;
    private int ClosingBalance;
    private ArrayList<TableRowModels> tableRows;
    private TableRowModels tablerowModels;
    private TableRowAdapter tablerowAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppf_maturity);

        recyclerView = (RecyclerView) findViewById(R.id.tableRow_recyclerview);



        Bundle yeardata = getIntent().getExtras();
        if(yeardata==null){
            return;
        }
        String yearmessage = yeardata.getString("yearmessage");
        Log.v(TAG,"year" + yearmessage);


        Bundle amountdata = getIntent().getExtras();
        if(amountdata==null){
            return;
        }

        String amountmessage = amountdata.getString("amountmessage");
        Log.v(TAG,"amount" + amountmessage);

        StartYear = Integer.parseInt(yearmessage);
        AmountDeposited=Integer.parseInt(amountmessage);
        OpeningBalance = 0;
        InterestEarned =(int)(AmountDeposited*0.087);
        ClosingBalance = AmountDeposited+InterestEarned;

        tableRows = new ArrayList<>();
        tablerowAdapter = new TableRowAdapter(this,tableRows);

        tablerowModels = new TableRowModels();
        tablerowModels.setAmountDeposited(AmountDeposited);
        tablerowModels.setStartYear(StartYear);
        tablerowModels.setOpeningBalance(OpeningBalance);
        tablerowModels.setInterestEarned(InterestEarned);
        tablerowModels.setClosingBalance(ClosingBalance);
        tableRows.add(tablerowModels);
        tablerowAdapter.notifyDataSetChanged();

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(tablerowAdapter);

        ppfCalc(StartYear, ClosingBalance);
    }

    public void ppfCalc(int Year, int CBalance){
        int i = 0;
        while(i!=14)
        {

            int OBalance;
            int intermediateResult;
            int interest;
            TableRowModels tablerowModel = new TableRowModels();

            Year = Year+1;
            tablerowModel.setStartYear(Year);

            OBalance = CBalance;
            tablerowModel.setOpeningBalance(OBalance);

            tablerowModel.setAmountDeposited(AmountDeposited);

            intermediateResult = (CBalance + AmountDeposited);
            interest = (int)(intermediateResult* 0.087);
            tablerowModel.setInterestEarned(interest);

            CBalance = intermediateResult + interest;
            tablerowModel.setClosingBalance(CBalance);

            tableRows.add(tablerowModel);

            i++;
        }
        tablerowAdapter.notifyDataSetChanged();
        Log.v(TAG, "Added" +tablerowAdapter.getItemCount());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ppf_maturity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.shreyaprabhu.ppf_calculator;

import java.io.Serializable;

/**
 * Created by Shreya Prabhu on 6/22/2016.
 */
public class TableRowModels implements Serializable {
    private int StartYear;
    private int OpeningBalance;
    private int AmountDeposited;
    private int InterestEarned;
    private int ClosingBalance;

    public TableRowModels()
    {

    }

    public TableRowModels(int StartYear,int OpeningBalance, int AmountDeposited, int InterestEarned,int ClosingBalance)
    {
        this.StartYear = StartYear;
        this.OpeningBalance = OpeningBalance;
        this.AmountDeposited = AmountDeposited;
        this.InterestEarned = InterestEarned;
        this.ClosingBalance = ClosingBalance;
    }

    public void setStartYear(int StartYear){
        this.StartYear = StartYear;
    }

    public int getStartYear(){
        return StartYear;
    }

    public void setAmountDeposited(int AmountDeposited){
        this.AmountDeposited = AmountDeposited;
    }

    public int getAmountDeposited(){
        return AmountDeposited;
    }

    public void setOpeningBalance(int OpeningBalance){
        this.OpeningBalance = OpeningBalance;
    }

    public int getOpeningBalance(){
        return OpeningBalance;
    }

    public void setInterestEarned(int InterestEarned){
        this.InterestEarned = InterestEarned;
    }

    public int getInterestEarned(){
        return InterestEarned;
    }

    public void setClosingBalance(int ClosingBalance){
        this.ClosingBalance = ClosingBalance;
    }

    public int getClosingBalance(){
        return ClosingBalance;
    }

}

package com.example.shreyaprabhu.ppf_calculator;

import java.io.Serializable;

/**
 * Created by Shreya Prabhu on 6/22/2016.
 */

class TableRowModels implements Serializable {
    private int StartYear;
    private int OpeningBalance;
    private int AmountDeposited;
    private int InterestEarned;
    private int ClosingBalance;

    TableRowModels(){
    }

    TableRowModels(int StartYear,int OpeningBalance, int AmountDeposited, int InterestEarned,int ClosingBalance){
        this.StartYear = StartYear;
        this.OpeningBalance = OpeningBalance;
        this.AmountDeposited = AmountDeposited;
        this.InterestEarned = InterestEarned;
        this.ClosingBalance = ClosingBalance;
    }

    void setStartYear(int StartYear){
        this.StartYear = StartYear;
    }

    int getStartYear(){
        return StartYear;
    }

    void setAmountDeposited(int AmountDeposited){
        this.AmountDeposited = AmountDeposited;
    }

    int getAmountDeposited(){
        return AmountDeposited;
    }

    void setOpeningBalance(int OpeningBalance){
        this.OpeningBalance = OpeningBalance;
    }

    int getOpeningBalance(){
        return OpeningBalance;
    }

    void setInterestEarned(int InterestEarned){
        this.InterestEarned = InterestEarned;
    }

    int getInterestEarned(){
        return InterestEarned;
    }

    void setClosingBalance(int ClosingBalance){
        this.ClosingBalance = ClosingBalance;
    }

    int getClosingBalance(){
        return ClosingBalance;
    }

}

package com.algorunner.backend.Models;

/*
 * Model for responses of Sorted Number algorithms
 */
public class SortedReturn {
    private long executionTime;
    private int[] sortedValues;

    public SortedReturn(long executionTime, int[] sortedValues){
        this.executionTime = executionTime;
        this.sortedValues = sortedValues;
    }

    public long getExecutionTime(){
        return this.executionTime;
    }

    public int[] getSortedValues(){
        return this.sortedValues;
    }
}

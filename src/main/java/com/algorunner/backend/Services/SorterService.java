package com.algorunner.backend.Services;
import org.springframework.stereotype.Service;

import com.algorunner.backend.Models.SortedReturn;
import com.algorunner.backend.Utilities.Timer;

@Service
public class SorterService {
    public SorterService(){}

    /**
     * Sorts an array of integers using the bubble sort algorithm.
     *
     * @param nums the array of integers to be sorted
     * @return a SortedReturn object containing the sorted array and the time taken to sort
     */
    public SortedReturn bubbleSort(int[] nums){
        Timer clock = new Timer();
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        return new SortedReturn(clock.stop(), nums);
    }    
}

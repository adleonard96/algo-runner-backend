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

    public SortedReturn insertionSort(int[] nums){
        Timer clock = new Timer();
        // TODO: Added logic for insertion sort
        return new SortedReturn(clock.stop(), nums);
    }

    /**
     * Sorts array of integers using the selection sort algorithm
     * 
     * @param nums the array of integers to be sorted
     * @return a SortedReturn object containing the sorted array and the time taken to sort
     */
    public SortedReturn selectionSort(int[] nums){
        int n = nums.length;
        Timer clock = new Timer();
        for (int i = 0; i < n-1; i++){
            int minIdx = i;
            for (int j = i+1; j < n; j++){
                if (nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }
        return new SortedReturn(clock.stop(), nums);
    }

    public static SorterService mergeSort(int[] nums){
        Timer clock = new Timer();
        return new SortedReturn(clock.stop(), nums);
    }
    //Quick Sort
    //Heap sort
    public static SorterService countSort(int[] nums){
        int N = inputArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
    }
    //Radix Sort
    //Bucket Sort
    //...
}

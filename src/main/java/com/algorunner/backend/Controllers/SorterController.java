package com.algorunner.backend.Controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/sorting")
public class SorterController {
    @PostMapping("/bubbleSort")
    public int[] postMethodName(@RequestBody int[] nums) {
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        return nums;
    }
}

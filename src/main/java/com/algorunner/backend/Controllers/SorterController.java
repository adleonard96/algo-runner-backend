package com.algorunner.backend.Controllers;
import org.springframework.web.bind.annotation.RestController;

import com.algorunner.backend.Models.SortedReturn;
import com.algorunner.backend.Services.SorterService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/sorting")
public class SorterController {
    private final SorterService sorter;

    public SorterController(SorterService sorterService){
        this.sorter = sorterService;
    }
    
    @PostMapping("/bubbleSort")
    public ResponseEntity<SortedReturn> bubbleSort(@RequestBody int[] nums) {
        SortedReturn returnValue;
        try {
            returnValue = sorter.bubbleSort(nums);
        } catch (Error e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<SortedReturn>(returnValue, HttpStatus.OK);
    }
}

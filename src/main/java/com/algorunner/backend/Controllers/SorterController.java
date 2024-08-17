package com.algorunner.backend.Controllers;
import org.springframework.web.bind.annotation.RestController;

import com.algorunner.backend.Services.SorterService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.json.JSONObject;

@RestController
@RequestMapping("/api/sorting")
public class SorterController {
    private SorterService sorter = new SorterService();

    @PostMapping("/bubbleSort")
    public String postMethodName(@RequestBody int[] nums) {
        JSONObject obj = new JSONObject(sorter.bubbleSort(nums));
        return obj.toString();
    }
}

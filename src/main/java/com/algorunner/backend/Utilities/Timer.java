package com.algorunner.backend.Utilities;

import java.util.Date;

public class Timer {
    private Date start;
    private Date stop;
    public Timer(){
        this.start = new Date();
    }

    public long stop() {
        this.stop = new Date();
        return stop.getTime() - start.getTime();
    }
    
}

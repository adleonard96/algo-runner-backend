package com.algorunner.backend.Utilities;

import java.util.Date;

/*
 * class used to track time between certain actions
 * used to determine run time of algorithms
 */
public class Timer {
    private Date start;
    private Date stop;

    /**
     * Starts timer clock in construction
     */
    public Timer(){
        this.start = new Date();
    }

    /**
     * Is used to stop timer.  Technically timer countinues and stop can be called and returns between several different steps.
     * @return number of seconds between start and stop
     */
    public long stop() {
        this.stop = new Date();
        return stop.getTime() - start.getTime();
    }
    
}

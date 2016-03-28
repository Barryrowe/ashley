package com.badlogic.ashley.core;

/**
 * A slightly silly abstraction of getting the current timestamp so that
 * we can mock it and make unit tests output consistend and verifiable
 * time steps.
 */
public class Clock {

    /**
     * Lookup the current system timestamp in Millis.
     * @return the current system timestamp in milliseconds.
     */
    public long getCurrentTimeStamp(){
        return System.currentTimeMillis();
    }
}

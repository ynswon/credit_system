package com.funda.kcb;

/**
 * Created by wonjun-pc on 2016-07-05.
 */
public class Abortable {
    public boolean done = false;

    public Abortable() {
        init();
    }

    public void init() {
        done = false;
    }

    public boolean isDone() {
        return done;
    }
}
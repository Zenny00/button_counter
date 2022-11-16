package com.example.tapbuttoncounter;

public class Counter {
    private int mCount;

    //Counter constructor
    public Counter()
    {
        mCount = 0;
    }

    //Increment count by 1
    public void addCount()
    {
        mCount++;
    }

    //Gets the current count
    public Integer getCount()
    {
        return mCount;
    }
}

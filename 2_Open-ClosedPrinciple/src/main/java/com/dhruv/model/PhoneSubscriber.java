package com.dhruv.model;

import com.dhruv.entity.CallHistory;

import java.util.List;

public class PhoneSubscriber extends  Subsriber{


    //Open for Extension
    @Override
    public double calculateBill() {
        Long subscriberId=getSubscriberId();
        List<CallHistory.Call> sessions=CallHistory.getCurrentCalls(subscriberId);

        long totalDuration=sessions.stream().mapToLong(CallHistory.Call:: getDuration).sum();

        long baserate =getBaseRate();
        return totalDuration*baserate/100;
    }
}

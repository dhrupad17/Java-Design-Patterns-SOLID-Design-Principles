package com.dhruv.model;

import com.dhruv.entity.InternetSessionHistory;

import java.util.List;

public class InternetSubscriber extends  Subsriber {



    private long freeUsage;

    public InternetSubscriber() {
    }

    @Override
    public double calculateBill() {
        Long subscriberId=getSubscriberId();
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        long baseRate=getBaseRate();
        return chargeableData*baseRate/100;
    }


    public long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }
}

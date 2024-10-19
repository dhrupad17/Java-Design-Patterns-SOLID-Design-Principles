package com.dhruv.aws;

import com.dhruv.Storage;

public class S3Storage implements Storage {

    public S3Storage(int capacityMib){
        System.out.println("Allocated "+capacityMib+" on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3Storage";
    }
}

package com.dhruv.aws;

import com.dhruv.Instance;
import com.dhruv.ResourceFactory;
import com.dhruv.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}

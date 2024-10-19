package com.dhruv.gcp;

import com.dhruv.Instance;
import com.dhruv.ResourceFactory;
import com.dhruv.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}

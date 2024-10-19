package com.dhruv.gcp;

import com.dhruv.Instance;
import com.dhruv.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity){
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Compute Engine Instance Started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute Engine Instance Stopped");
    }
}

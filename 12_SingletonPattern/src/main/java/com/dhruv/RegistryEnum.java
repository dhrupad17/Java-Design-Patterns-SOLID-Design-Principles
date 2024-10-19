package com.dhruv;

public enum RegistryEnum {

    /*
    * Since Java 1.5 using enum we can create a singleton. It handles serialization using java's in-built
     mechanism and still ensure single instance
    * */

    INSTANCE;

    public void someMethod(){
        //Do the code here
    }
}

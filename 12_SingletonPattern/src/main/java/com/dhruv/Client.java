package com.dhruv;

public class Client {
    //Driver Code
    public static void main(String[] args) {
        LazyRegistryIODH singleton;

        singleton=LazyRegistryIODH.getInstance();
        LazyRegistryIODH singleton2=LazyRegistryIODH.getInstance();
        System.out.println(singleton == singleton2);
    }
}

package com.dhruv;


public class LazyRegistryIODH {
    /*
    * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
     * without worrying about synchronization.
    * */

    private LazyRegistryIODH(){
        System.out.println("In LazyRegistryIODH Singleton");
    }

    private static class RegistryHolder{
        static LazyRegistryIODH INSTANCE=new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}

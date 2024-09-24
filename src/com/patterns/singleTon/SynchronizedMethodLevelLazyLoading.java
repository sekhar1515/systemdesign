package com.patterns.singleTon;

public class SynchronizedMethodLevelLazyLoading {

    private static SynchronizedMethodLevelLazyLoading synchronizedMethodLevelLazyLoading = null;

    private SynchronizedMethodLevelLazyLoading(){}

    public static synchronized SynchronizedMethodLevelLazyLoading getInstance(){
        if(synchronizedMethodLevelLazyLoading == null){
            synchronizedMethodLevelLazyLoading = new SynchronizedMethodLevelLazyLoading();
        }
        return synchronizedMethodLevelLazyLoading;
    }

    public void print() {
        System.out.println("Synchronizing initialization ");
    }
}

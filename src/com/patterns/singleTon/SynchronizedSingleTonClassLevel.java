package com.patterns.singleTon;

public class SynchronizedSingleTonClassLevel {
    private static volatile SynchronizedSingleTonClassLevel synchronizedMethodLevelLazyLoading = null;

    private SynchronizedSingleTonClassLevel(){}

    public static SynchronizedSingleTonClassLevel getInstance(){
        if(synchronizedMethodLevelLazyLoading == null){
            synchronized (SynchronizedSingleTonClassLevel.class){
                if(synchronizedMethodLevelLazyLoading == null){
                    synchronizedMethodLevelLazyLoading = new SynchronizedSingleTonClassLevel();
                }
            }
        }
        return synchronizedMethodLevelLazyLoading;
    }
    public void print(){
        System.out.println("Synchronized class level ");
    }
}

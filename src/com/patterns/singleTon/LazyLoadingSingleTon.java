package com.patterns.singleTon;

public class LazyLoadingSingleTon {

    private static LazyLoadingSingleTon lazyLoadingSingleTon = null;

    private LazyLoadingSingleTon() {
    }

    public static LazyLoadingSingleTon getInstance() {
        if (lazyLoadingSingleTon == null) {
            lazyLoadingSingleTon = new LazyLoadingSingleTon();
        }
        return lazyLoadingSingleTon;
    }

    public void print() {
        System.out.println("LazyLoading initialization ");
    }
}

package com.patterns.singleTon;

public class EagerLoadingSingleTon {
    private static final EagerLoadingSingleTon eagerLoadingSingleTon = new EagerLoadingSingleTon();

    private EagerLoadingSingleTon() {
    }

    public static EagerLoadingSingleTon getInstance() {
        return eagerLoadingSingleTon;
    }

    public void print() {
        System.out.println("EagerLoading initialization ");
    }
}

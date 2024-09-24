package com.patterns.singleTon;

public class BillPughSolution {

    private BillPughSolution(){
    }
    private static class ClassHelper{
        private static final BillPughSolution billpugh = new BillPughSolution();
    }
    public static BillPughSolution getInstance(){
        return ClassHelper.billpugh;
    }

    public void printBillPughInstnace(){
        System.out.println("Bill Pugh Printing ");
    }
}

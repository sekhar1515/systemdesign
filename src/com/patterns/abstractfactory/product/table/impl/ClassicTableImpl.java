package com.patterns.abstractfactory.product.table.impl;

import com.patterns.abstractfactory.product.table.Table;

public class ClassicTableImpl implements Table {
    @Override
    public void typeOfTable() {
        System.out.println("you are having classic table for your usage ");
    }

    @Override
    public void purposeOfTable() {
        System.out.println(" Classic table is used for dining ");
    }
}

package com.patterns.abstractfactory.product.table.impl;

import com.patterns.abstractfactory.product.table.Table;

public class ModernTableImpl implements Table {
    @Override
    public void typeOfTable() {
        System.out.println(" you are using modern table to suit modern living ");
    }

    @Override
    public void purposeOfTable() {
        System.out.println("You can sleep on modern table apart from dining ");
    }
}

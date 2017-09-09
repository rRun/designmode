package com.fortis.designmode.create.simplefactory;

public class PngReader implements Reader{
    @Override
    public void read() {
        System.out.println("读取png");
    }
}

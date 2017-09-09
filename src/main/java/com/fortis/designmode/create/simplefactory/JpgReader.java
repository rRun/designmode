package com.fortis.designmode.create.simplefactory;

public class JpgReader implements Reader{
    @Override
    public void read() {
        System.out.println("读取jpg");
    }
}

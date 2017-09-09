package com.fortis.designmode.create.simplefactory;

public class JpgReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        JpgReader jpgReader = new JpgReader();
        System.out.println("创建jpg");
        return jpgReader;
    }
}

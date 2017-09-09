package com.fortis.designmode.create.simplefactory;

public class PngReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        PngReader pngReader = new PngReader();
        System.out.println("创建png");
        return pngReader;
    }
}

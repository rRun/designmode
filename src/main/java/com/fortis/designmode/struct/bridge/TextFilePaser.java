package com.fortis.designmode.struct.bridge;

public class TextFilePaser implements FilePaser{
    @Override
    public void parse(String content) {
        System.out.println(content + "text");
    }
}

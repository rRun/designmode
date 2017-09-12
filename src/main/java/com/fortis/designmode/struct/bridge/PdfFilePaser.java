package com.fortis.designmode.struct.bridge;

public class PdfFilePaser implements FilePaser{
    @Override
    public void parse(String content) {
        System.out.println(content + "pdf");
    }
}

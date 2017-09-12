package com.fortis.designmode.struct.decorator;

public class SimpleEncoder implements Encoder{
    @Override
    public String encode(String encodeStr) {
        return "简单加密："+encodeStr;
    }
}

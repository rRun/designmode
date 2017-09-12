package com.fortis.designmode.struct.decorator;

public class SecondEncoderDecorator implements Encoder{

    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }

    public Encoder getEncoder() {
        return this;
    }

    private Encoder encoder;

    @Override
    public String encode(String encodeStr) {
        return this.secondEncode(this.encoder.encode(encodeStr));
    }

    private String secondEncode (String encodeStr){
        return "第二次加密：" + encodeStr;
    }
}

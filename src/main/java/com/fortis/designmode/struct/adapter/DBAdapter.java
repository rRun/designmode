package com.fortis.designmode.struct.adapter;

public class DBAdapter implements DateBaseOperateInterface {
    private Encoder encoder;

    @Override
    public void save(String string) {
        System.out.println("保存:"+this.encoder.encode(string));
    }

    public DBAdapter(){
        this.encoder = new Encoder();
    }

    public DBAdapter(Encoder encoder){
        this.encoder = encoder;
    }
}

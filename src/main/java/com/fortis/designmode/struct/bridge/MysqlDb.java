package com.fortis.designmode.struct.bridge;

public class MysqlDb extends DB{
    @Override
    public void convert() {
        this.filePaser.parse("mysql:");
    }
}

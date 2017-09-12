package com.fortis.designmode.struct.bridge;

public class SqlServerDb extends DB{
    @Override
    public void convert() {
        this.filePaser.parse("sql server:");
    }
}

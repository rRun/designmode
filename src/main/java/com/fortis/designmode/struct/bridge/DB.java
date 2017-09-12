package com.fortis.designmode.struct.bridge;

public abstract class DB {

    protected FilePaser filePaser;

    public void setFilePaser(FilePaser filePaser) {
        this.filePaser = filePaser;
    }

    public abstract void convert();
}

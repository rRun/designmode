package com.fortis.designmode.struct.flyweight;

public abstract class Document {
    public abstract String getContent();
    public void display(Coordinate coordinate) {
        System.out.println("文件内容：" + this.getContent() + "文件在："+coordinate.getSite());
    }
}

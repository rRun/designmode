package com.fortis.designmode.struct.flyweight;

import org.junit.Test;

public class DocumentTest {

    @Test
    public void getDocument(){
        Document img1,img2,text1,text2;
        DocumentFactory factory = DocumentFactory.getDocumentFactory();
        img1 = factory.getDocumet("img");
        img2 = factory.getDocumet("img");
        text1=factory.getDocumet("text");
        text2=factory.getDocumet("text");

        img1.display(new Coordinate("文件夹1"));
        img2.display(new Coordinate("文件夹2"));
        text1.display(new Coordinate("文件夹1"));
        text2.display(new Coordinate("文件夹2"));

    }
}

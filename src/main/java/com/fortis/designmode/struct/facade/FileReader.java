package com.fortis.designmode.struct.facade;

import java.io.Console;

public class FileReader {
    public String Read(String fileNameSrc)
    {
        System.out.println("读取文件，获取明文：");
        return "读取" + fileNameSrc;
    }
}

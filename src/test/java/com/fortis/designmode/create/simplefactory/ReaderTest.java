package com.fortis.designmode.create.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderTest {

    /**
     * 工厂模式解决了简单工厂中创建逻辑修改的问题 if else过多的问题
     * @throws Exception
     */
    @Test
    public void read() throws Exception {
        ReaderFactory readerFactory = new PngReaderFactory();
        Reader pngReader =readerFactory.getReader();
        pngReader.read();
        assert(pngReader != null);
    }

}
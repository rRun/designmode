package com.fortis.designmode.create.commonfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChatTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * 简单工厂模式解决了 产品生产过程代码重复的问题
     * @throws Exception
     */
    @Test
    public void display() throws Exception {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
        assert(chart!=null);
    }

}
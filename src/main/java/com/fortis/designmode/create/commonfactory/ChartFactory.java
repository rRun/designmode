package com.fortis.designmode.create.commonfactory;

public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart = null;
        if (type.equals("line")){
            chart = new HistogramChart();
            System.out.println("初始化设置线性图！");
        }else if (type.equals("histogram")){
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        return chart;
    }
}

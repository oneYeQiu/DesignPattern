package com.itjj.OpenClosePrinciple.Impl;


/**
 * 起冲突的类 去扩展CalculationArea类
 */
public class CalculationAreaExt extends CalculationArea {

    private static final double PI = 3.1415926D;
    @Override
    public double circle(double radius) {
        return PI * radius * radius;
    }

}

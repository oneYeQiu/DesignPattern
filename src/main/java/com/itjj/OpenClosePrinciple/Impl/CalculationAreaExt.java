package com.itjj.OpenClosePrinciple.Impl;

public class CalculationAreaExt extends CalculationArea {

    private static final double PI = 3.1415926D;
    @Override
    public double circle(double radius) {
        return PI * radius * radius;
    }

}

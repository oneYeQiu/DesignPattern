package com.itjj.OpenClosePrinciple.Impl;

import com.itjj.OpenClosePrinciple.ICalculationArea;

public class CalculationArea implements ICalculationArea {

    private static final double PI = 3.14D;
    @Override
    public double triangle(double a, double b, double c) {
        double p = (a + b + c) / 2D;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double rectangle(double a, double b) {
        return a * b;
    }

    @Override
    public double circle(double radius) {
        return PI * radius * radius;
    }
}

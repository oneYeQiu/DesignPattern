package com.itjj.OpenClosePrinciple.Impl;

import com.itjj.OpenClosePrinciple.ICalculationArea;
import junit.framework.TestCase;
import org.junit.Test;

public class CalculationAreaTest extends TestCase {

    @Test
    public void testTriangle() {
        ICalculationArea calculationArea = new CalculationArea();
        double area = calculationArea.triangle(3, 4, 5);
        System.out.println(area);
    }

    @Test
    public void testRectangle() {
        ICalculationArea calculationArea = new CalculationArea();
        double area = calculationArea.rectangle(3, 4);
        System.out.println(area);
    }

    @Test
    public void testCircle() {
        ICalculationArea calculationArea = new CalculationArea();
        double area = calculationArea.circle(3);
        System.out.println(area);
    }
}
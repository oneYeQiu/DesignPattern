package com.itjj.OpenClosePrinciple.Impl;

import com.itjj.OpenClosePrinciple.ICalculationArea;
import junit.framework.TestCase;
import org.junit.Test;

public class CalculationAreaExtTest extends TestCase {

    @Test
    public void testCircle() {
        ICalculationArea calculationArea = new CalculationAreaExt();
        double area = calculationArea.circle(3);
        System.out.println(area);
    }

}
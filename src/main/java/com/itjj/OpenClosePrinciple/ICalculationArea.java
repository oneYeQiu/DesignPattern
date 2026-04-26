package com.itjj.OpenClosePrinciple;

/**
 * 开闭原则则是通过增加新代码而不是修改旧代码来应对需求变化。
 */
public interface ICalculationArea {

    /**
     * 计算三角形面积
     * @param a 三角形的一条边
     * @param b 三角形的一条边
     * @param c 三角形的一条边
     * @return 三角形的面积
     */
    double triangle(double a, double b, double c);

    /**
     * 计算矩形(长方形)的面积
     * @param a 矩形的一条边
     * @param b 矩形的一条边
     * @return 矩形(长方形)的面积
     */
    double rectangle(double a, double b);

    /**
     * 计算圆的面积
     * @param radius 圆的半径
     * @return 圆的面积
     */
    double circle(double radius);

}

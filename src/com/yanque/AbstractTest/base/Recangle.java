package com.yanque.AbstractTest.base;
// 子类-矩形
public class Recangle extends Shape{
    private double width;
    private double height;

    public Recangle() {
    }

    public Recangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

package com.company;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D {

    private Point point;
    private double wight;
    private double height;

    public Rectangle(){
        point = new Point();
    }
    public Rectangle(double x, double y, double wight, double height) {
        point = new Point(x, y);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public void setRect(double x, double y, double wight, double height) {
     point.setLocation(x, y);
     this.wight = wight;
     this.height = height;
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return wight;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        if(wight <= 0 || height <= 0) return false;
        return true;
    }
}

package com.company;

import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class Arc extends Arc2D {

    private Point point;
    private double angleStart;
    private double angleExtent;
    private double width;
    private double height;
    private int arcType;

    public Arc() {
        point = new Point();
    }

    public Arc(double x, double y, double w, double h, double angSt, double angExt, int closure) {
        point = new Point(x, y);
        this.width = w;
        this.height = h;
        this.angleStart = angSt;
        this.angleExtent = angExt;
        this.arcType = closure;
    }

    @Override
    public double getAngleStart() { //где начинается дуга
        return angleStart;
    }

    @Override
    public double getAngleExtent() { // где заканчивается дуга
        return angleExtent;
    }

    @Override
    public void setArc(double x, double y, double w, double h, double angSt, double angExt, int closure) {
        point.setLocation(x, y);
        this.width = w;
        this.height = h;
        this.angleStart = angSt;
        this.angleExtent = angExt;
        this.arcType = closure;
    }

    @Override
    public void setAngleStart(double angSt) {
        this.angleStart = angSt;
    }

    @Override
    public void setAngleExtent(double angExt) {
        this.angleExtent = angExt;
    }

    @Override
    protected Rectangle2D makeBounds(double x, double y, double w, double h) {
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
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

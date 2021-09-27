package com.company;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {

    private Point point;
    private double width;
    private double height;

    public Circle(){
        point = new Point();
    }
    public Circle(double x, double y, double w, double h) {
        point = new Point(x, y);
        this.width = w;
        this.height = h;
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

    @Override
    public void setFrame(double x, double y, double w, double h) {
      point.setLocation(x, y);
      this.width = w;
      this.height = h;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}

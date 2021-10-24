package com.company;

import javafx.geometry.Point2D;

import java.util.Scanner;

public class Create {
    public static double[][] create(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите координаты фигуры (x0, y0, wight, height): ");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double wight = scan.nextDouble();
        double height = scan.nextDouble();

        Point2D p0 = new Point2D(x0, y0);
        Point2D p1 = new Point2D(x0 + wight, y0);
        Point2D p2 = new Point2D(x0, y0 + height);
        Point2D p3 = new Point2D(x0 + wight, y0 + height);

        double[][] arr = {{p0.getX(), p0.getY(), 1}, {p1.getX(), p1.getY(), 1}, {p2.getX(), p2.getY(), 1}, {p3.getX(), p3.getY(), 1}};
        return arr;
    }
}

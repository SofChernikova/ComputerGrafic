package com.company;

import java.awt.*;

//сделала обычный массив из координат точек для дальнейших преобразований
public class CreateArr {
    public static double[][] pointsToArr(Point[] points){
        double[][] arr = {
                {points[0].x, points[0].y, 1},
                {points[1].x, points[1].y, 1},
                {points[2].x, points[2].y, 1},
                {points[3].x, points[3].y, 1}
        };
        return arr;
    }
    public static Point[] arrTiPoints(double[][] arr){
        Point[] points = new Point[4];
        points[0] = new Point((int) arr[0][0], (int) arr[0][1]);
        points[1] = new Point((int) arr[1][0], (int) arr[1][1]);
        points[2] = new Point((int) arr[2][0], (int) arr[2][1]);
        points[3] = new Point((int) arr[3][0], (int) arr[3][1]);
        return points;
    }
}

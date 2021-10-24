package com.company;

public class Translation {
    public static double[][] translation(double[][] arr, double x, double y){
        double[][] tempArr = {{1, 0, 0}, {0, 1, 0}, {x, y, 1}}; //массив для смещения
        double[][] newArr = new double[4][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    newArr[i][j] += arr[i][k] * tempArr[k][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = newArr[i][j];
            }
        }

        return arr;
    }
}

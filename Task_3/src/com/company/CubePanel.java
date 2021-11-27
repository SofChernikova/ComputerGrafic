package com.company;

import javax.swing.*;
import java.awt.*;

public class CubePanel extends JPanel {
    private static final int D_W = 400;
    private static final int D_H = 400;

    Cube cube;

    public CubePanel() {
        cube = new Cube(75, 75, 200, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cube.drawCube(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(D_W, D_H);
    }

    public class Cube {
        int x, y, size, shift;
        Point[] frontCubePoints;
        Point[] backgroundCubePoints;

        public Cube(int x, int y, int size, int shift) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.shift = shift;
            frontCubePoints = getFrontCubePoints();
            backgroundCubePoints = getBackgroundCubePoints();
        }

       private Point[] getBackgroundCubePoints() { //рисуем задний куб
            Point[] points = new Point[4];
            points[0] = new Point(x, y);
            points[1] = new Point(x + size, y);
            points[2] = new Point(x + size, y + size);
            points[3] = new Point(x, y + size);
            return points;
        }

        private Point[] getFrontCubePoints() { //передний кубик, сдвинутый
            int newX = x + shift;
            int newY = y + shift;
            Point[] points = new Point[4];
            points[0] = new Point(newX, newY);
            points[1] = new Point(newX + size, newY);
            points[2] = new Point(newX + size, newY + size);
            points[3] = new Point(newX, newY + size);
            return points;
        }

        public void drawCube(Graphics g) {
            g.setColor(Color.GREEN);
            g.drawLine(138, 138, 138, 98);
            g.drawLine(138, 138, 168, 138);
            g.drawLine(138, 138, 118, 148);
            g.setColor(Color.BLACK);
            /** Рисуем кубик */
           /* Point[] backgroundPoints = cube.getBackgroundCubePoints();
            g.drawLine(backgroundPoints[0].x, backgroundPoints[0].y, backgroundPoints[1].x, backgroundPoints[1].y );
            g.drawLine(backgroundPoints[1].x, backgroundPoints[1].y, backgroundPoints[2].x, backgroundPoints[2].y );
            g.drawLine(backgroundPoints[2].x, backgroundPoints[2].y, backgroundPoints[3].x, backgroundPoints[3].y );
            g.drawLine(backgroundPoints[0].x, backgroundPoints[0].y, backgroundPoints[3].x, backgroundPoints[3].y );
            Point[] frontPoints = cube.getFrontCubePoints();
            g.drawLine(frontPoints[0].x, frontPoints[0].y, frontPoints[1].x, frontPoints[1].y );
            g.drawLine(frontPoints[1].x, frontPoints[1].y, frontPoints[2].x, frontPoints[2].y );
            g.drawLine(frontPoints[2].x, frontPoints[2].y, frontPoints[3].x, frontPoints[3].y );
            g.drawLine(frontPoints[0].x, frontPoints[0].y, frontPoints[3].x, frontPoints[3].y );
            for (int i = 0; i < 4; i++) {
                g.drawLine(frontPoints[i].x, frontPoints[i].y,
                        backgroundPoints[i].x, backgroundPoints[i].y);
            } */

            /** МАСШТАБИРОВАНИЕ */
          /*Point[] backgroundPoints = cube.getBackgroundCubePoints();
            double[][] backgroundArr = CreateArr.pointsToArr(backgroundPoints);
            double s = 2;
            backgroundArr = Scale.scale(backgroundArr, backgroundPoints[0], s);
            Point[] newBackgroundPoints = CreateArr.arrTiPoints(backgroundArr);
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[1].x, newBackgroundPoints[1].y );
            g.drawLine(newBackgroundPoints[1].x, newBackgroundPoints[1].y, newBackgroundPoints[2].x, newBackgroundPoints[2].y );
            g.drawLine(newBackgroundPoints[2].x, newBackgroundPoints[2].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );

            Point[] frontPoints = cube.getFrontCubePoints();
            double[][] frontArr = CreateArr.pointsToArr(frontPoints);
            frontArr = Scale.scale(frontArr, frontPoints[0], s);
            Point[] newFrontPoints = CreateArr.arrTiPoints(frontArr);
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[1].x, newFrontPoints[1].y );
            g.drawLine(newFrontPoints[1].x, newFrontPoints[1].y, newFrontPoints[2].x, newFrontPoints[2].y );
            g.drawLine(newFrontPoints[2].x, newFrontPoints[2].y, newFrontPoints[3].x, newFrontPoints[3].y );
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[3].x, newFrontPoints[3].y );
            // draw connecting lines
            for (int i = 0; i < 4; i++) {
                g.drawLine(newFrontPoints[i].x, newFrontPoints[i].y,
                        newBackgroundPoints[i].x, newBackgroundPoints[i].y);
            } */

              /** СДВИГ */
           /* Point[] backgroundPoints = cube.getBackgroundCubePoints();
            double[][] backgroundArr = CreateArr.pointsToArr(backgroundPoints);
            double f = 2;
            backgroundArr = Shear.shear(backgroundArr, backgroundPoints[0], f);
            Point[] newBackgroundPoints = CreateArr.arrTiPoints(backgroundArr);
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[1].x, newBackgroundPoints[1].y );
            g.drawLine(newBackgroundPoints[1].x, newBackgroundPoints[1].y, newBackgroundPoints[2].x, newBackgroundPoints[2].y );
            g.drawLine(newBackgroundPoints[2].x, newBackgroundPoints[2].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );

            Point[] frontPoints = cube.getFrontCubePoints();
            double[][] frontArr = CreateArr.pointsToArr(frontPoints);
            frontArr = Shear.shear(frontArr, frontPoints[0], f);
            Point[] newFrontPoints = CreateArr.arrTiPoints(frontArr);
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[1].x, newFrontPoints[1].y );
            g.drawLine(newFrontPoints[1].x, newFrontPoints[1].y, newFrontPoints[2].x, newFrontPoints[2].y );
            g.drawLine(newFrontPoints[2].x, newFrontPoints[2].y, newFrontPoints[3].x, newFrontPoints[3].y );
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[3].x, newFrontPoints[3].y );
            // draw connecting lines
            for (int i = 0; i < 4; i++) {
                g.drawLine(newFrontPoints[i].x, newFrontPoints[i].y,
                        newBackgroundPoints[i].x, newBackgroundPoints[i].y);
            } */

              /** ВРАЩЕНИЕ */
           /* Point[] backgroundPoints = cube.getBackgroundCubePoints();
            double[][] backgroundArr = CreateArr.pointsToArr(backgroundPoints);
            double angle = 15;
            backgroundArr = Spin.spin(backgroundArr, backgroundPoints[0], angle);
            Point[] newBackgroundPoints = CreateArr.arrTiPoints(backgroundArr);
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[1].x, newBackgroundPoints[1].y );
            g.drawLine(newBackgroundPoints[1].x, newBackgroundPoints[1].y, newBackgroundPoints[2].x, newBackgroundPoints[2].y );
            g.drawLine(newBackgroundPoints[2].x, newBackgroundPoints[2].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );

            Point[] frontPoints = cube.getFrontCubePoints();
            double[][] frontArr = CreateArr.pointsToArr(frontPoints);
            frontArr = Spin.spin(frontArr, frontPoints[0], angle);
            Point[] newFrontPoints = CreateArr.arrTiPoints(frontArr);
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[1].x, newFrontPoints[1].y );
            g.drawLine(newFrontPoints[1].x, newFrontPoints[1].y, newFrontPoints[2].x, newFrontPoints[2].y );
            g.drawLine(newFrontPoints[2].x, newFrontPoints[2].y, newFrontPoints[3].x, newFrontPoints[3].y );
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[3].x, newFrontPoints[3].y );
            // draw connecting lines
            for (int i = 0; i < 4; i++) {
                g.drawLine(newFrontPoints[i].x, newFrontPoints[i].y,
                        newBackgroundPoints[i].x, newBackgroundPoints[i].y);
            } */

            /** ОБЫЧНОЕ ПЕРЕМЕЩЕНИЕ */
            Point[] backgroundPoints = cube.getBackgroundCubePoints();
            double[][] backgroundArr = CreateArr.pointsToArr(backgroundPoints);
            double x = 100;
            double y = 100;
            backgroundArr = Translation.translation(backgroundArr, x, y);
            Point[] newBackgroundPoints = CreateArr.arrTiPoints(backgroundArr);
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[1].x, newBackgroundPoints[1].y );
            g.drawLine(newBackgroundPoints[1].x, newBackgroundPoints[1].y, newBackgroundPoints[2].x, newBackgroundPoints[2].y );
            g.drawLine(newBackgroundPoints[2].x, newBackgroundPoints[2].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );
            g.drawLine(newBackgroundPoints[0].x, newBackgroundPoints[0].y, newBackgroundPoints[3].x, newBackgroundPoints[3].y );

            Point[] frontPoints = cube.getFrontCubePoints();
            double[][] frontArr = CreateArr.pointsToArr(frontPoints);
            frontArr = Translation.translation(frontArr, x, y);
            Point[] newFrontPoints = CreateArr.arrTiPoints(frontArr);
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[1].x, newFrontPoints[1].y );
            g.drawLine(newFrontPoints[1].x, newFrontPoints[1].y, newFrontPoints[2].x, newFrontPoints[2].y );
            g.drawLine(newFrontPoints[2].x, newFrontPoints[2].y, newFrontPoints[3].x, newFrontPoints[3].y );
            g.drawLine(newFrontPoints[0].x, newFrontPoints[0].y, newFrontPoints[3].x, newFrontPoints[3].y );
            // draw connecting lines
            for (int i = 0; i < 4; i++) {
                g.drawLine(newFrontPoints[i].x, newFrontPoints[i].y,
                        newBackgroundPoints[i].x, newBackgroundPoints[i].y);
            }

        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new CubePanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class DrawingLine extends Application {

    public Point2D spin(Point2D p1, Point2D p0, double angle) {
        angle = (Math.PI * angle) / 180;
        double x = p0.getX() + (p1.getX() - p0.getX()) * Math.cos(angle) - (p1.getY() - p0.getY()) * Math.sin(angle);
        double y = p0.getY() - (p1.getX() - p0.getX()) * Math.sin(angle) + (p1.getY() - p0.getY()) * Math.cos(angle);

        Point2D newP = new Point2D(x, y);
        return newP;
    }

    public Point2D shift(double shiftX, double shiftY, Point2D p1) {
        double x = p1.getX() + shiftX;
        double y = p1.getY() + shiftY;
        Point2D pNew = new Point2D(x, y);
        return pNew;
    }

    public Point2D scale(Point2D p0, double scale) {
        double x = p0.getX() * scale;
        double y = p0.getY() * scale;
        Point2D pNew = new Point2D(x, y);
        return pNew;
    }

    public void Menu() {
        System.out.println("Выберите действия из списка ниже");
        System.out.println("1. Смещение");
        System.out.println("2. Масштабирование");
        System.out.println("3. Поврот");
        System.out.println("4. Просто отрисовка фигуры");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Drawing");

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);

        Scanner scan = new Scanner(System.in);
        Menu();
        int action = scan.nextInt();

        switch (action) {
            case 1:
                System.out.println("Введите координаты фигуры (x1, y1, wight, height): ");
                double x0 = scan.nextDouble();
                double y0 = scan.nextDouble();
                double wight = scan.nextDouble();
                double height = scan.nextDouble();
                Point2D p0 = new Point2D(x0, y0);
                Point2D p1 = new Point2D(x0 + wight, y0);
                Point2D p2 = new Point2D(x0, y0 + height);
                Point2D p3 = new Point2D(x0 + wight, y0 + height);

                System.out.println("Введите координаты смещения (x1, y1):");
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                Point2D pX = new Point2D(x, y);
                double shiftX = pX.getX() - p0.getX();
                double shiftY = pX.getY() - p0.getY();

                p0 = shift(shiftX,shiftY, p0);
                p1 = shift(shiftX,shiftY, p1);
                p2 = shift(shiftX,shiftY, p2);
                p3 = shift(shiftX,shiftY, p3);

                Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
                Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
                Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
                Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());

                root.getChildren().add(line1);
                root.getChildren().add(line2);
                root.getChildren().add(line3);
                root.getChildren().add(line4);

                break;
            case 2:
                System.out.println("Введите координаты фигуры (x1, y1, wight, height): ");
                double x4 = scan.nextDouble();
                double y4 = scan.nextDouble();
                double wight4 = scan.nextDouble();
                double height4 = scan.nextDouble();
                Point2D p4 = new Point2D(x4, y4);
                Point2D p5 = new Point2D(x4 + wight4, y4);
                Point2D p6 = new Point2D(x4, y4 + height4);
                Point2D p7 = new Point2D(x4 + wight4, y4 + height4);

                System.out.println("Введите масштаб:");
                double scale = scan.nextDouble();

                p4 = scale(p4, scale);
                p5 = scale(p5, scale);
                p6 = scale(p6, scale);
                p7 = scale(p7, scale);

                Line line5 = new Line(p4.getX(), p4.getY(), p5.getX(), p5.getY());
                Line line6 = new Line(p4.getX(), p4.getY(), p6.getX(), p6.getY());
                Line line7 = new Line(p6.getX(), p6.getY(), p7.getX(), p7.getY());
                Line line8 = new Line(p7.getX(), p7.getY(), p5.getX(), p5.getY());

                root.getChildren().add(line5);
                root.getChildren().add(line6);
                root.getChildren().add(line7);
                root.getChildren().add(line8);

                break;
            case 3:
                System.out.println("Введите координаты фигуры (x1, y1, wight, height): ");
                double x8 = scan.nextDouble();
                double y8 = scan.nextDouble();
                double wight8 = scan.nextDouble();
                double height8 = scan.nextDouble();
                Point2D p8 = new Point2D(x8, y8);
                Point2D p9 = new Point2D(x8 + wight8, y8);
                Point2D p10 = new Point2D(x8, y8 + height8);
                Point2D p11 = new Point2D(x8 + wight8, y8 + height8);

                System.out.println("Введите угол поворота:");
                double angle = scan.nextDouble();
                Point2D p99 = spin(p9, p8, angle);
                Point2D p1010 = spin(p10, p8, -angle);
                Point2D p101010 = new Point2D(p1010.getX() + wight8, p1010.getY());
                Point2D p1111 = spin(p101010, p1010, angle);

                Line line9 = new Line(p8.getX(), p8.getY(), p99.getX(), p99.getY());
                Line line10 = new Line(p8.getX(), p8.getY(), p1010.getX(), p1010.getY());
                Line line11 = new Line(p1010.getX(), p1010.getY(), p1111.getX(), p1111.getY());
                Line line12 = new Line(p99.getX(), p99.getY(), p1111.getX(), p1111.getY());

                root.getChildren().add(line9);
                root.getChildren().add(line10);
                root.getChildren().add(line11);
                root.getChildren().add(line12);
                break;

            case 4:
                System.out.println("Введите координаты фигуры (x1, y1, wight, height): ");
                double x12 = scan.nextDouble();
                double y12 = scan.nextDouble();
                double wight12 = scan.nextDouble();
                double height12 = scan.nextDouble();
                Point2D p12 = new Point2D(x12, y12);
                Point2D p13 = new Point2D(x12 + wight12, y12);
                Point2D p14 = new Point2D(x12, y12 + height12);
                Point2D p15 = new Point2D(x12 + wight12, y12 + height12);

                Line line13 = new Line(p12.getX(), p12.getY(), p13.getX(), p13.getY());
                Line line14 = new Line(p12.getX(), p12.getY(), p14.getX(), p14.getY());
                Line line15 = new Line(p14.getX(), p14.getY(), p15.getX(), p15.getY());
                Line line16 = new Line(p15.getX(), p15.getY(), p13.getX(), p13.getY());

                root.getChildren().add(line13);
                root.getChildren().add(line14);
                root.getChildren().add(line15);
                root.getChildren().add(line16);
                break;
        }

        stage.setScene(scene);
        stage.show();

    }
}

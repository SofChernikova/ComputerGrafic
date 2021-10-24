import com.company.*;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class DrawingLine extends Application {
    /**
     * чтобы проделать эти же действия с произвольной точой
     * нужно просто внутри каждой функции сделать новую точку
     **/


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Drawing");
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        Scanner scan = new Scanner(System.in);

        double[][] arr = Create.create();
        Menu.menu();
        int count = scan.nextInt();

        if (count == 1) {
            Point2D p0 = new Point2D(arr[0][0], arr[0][1]);
            Point2D p1 = new Point2D(arr[1][0], arr[1][1]);
            Point2D p2 = new Point2D(arr[2][0], arr[2][1]);
            Point2D p3 = new Point2D(arr[3][0], arr[3][1]);
            Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
            Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
            Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
            root.getChildren().add(line1);
            root.getChildren().add(line2);
            root.getChildren().add(line3);
            root.getChildren().add(line4);
            stage.setScene(scene);
            stage.show();
        }
        if (count == 2) {
            System.out.println("Введите координаты смещения (х, у):");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            arr = Translation.translation(arr, x, y);
            Point2D p0 = new Point2D(arr[0][0], arr[0][1]);
            Point2D p1 = new Point2D(arr[1][0], arr[1][1]);
            Point2D p2 = new Point2D(arr[2][0], arr[2][1]);
            Point2D p3 = new Point2D(arr[3][0], arr[3][1]);
            Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
            Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
            Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
            root.getChildren().add(line1);
            root.getChildren().add(line2);
            root.getChildren().add(line3);
            root.getChildren().add(line4);
            stage.setScene(scene);
            stage.show();
        }
        if (count == 3) {
            System.out.println("Введите масштаб:");
            double s = scan.nextDouble();
            Point2D p = new Point2D(arr[0][0], arr[0][1]);
            arr = Scale.scale(arr, p, s);
            Point2D p0 = new Point2D(arr[0][0], arr[0][1]);
            Point2D p1 = new Point2D(arr[1][0], arr[1][1]);
            Point2D p2 = new Point2D(arr[2][0], arr[2][1]);
            Point2D p3 = new Point2D(arr[3][0], arr[3][1]);
            Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
            Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
            Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
            root.getChildren().add(line1);
            root.getChildren().add(line2);
            root.getChildren().add(line3);
            root.getChildren().add(line4);
            stage.setScene(scene);
            stage.show();
        }
        if (count == 4) {
            System.out.println("Введите величину сдвига:");
            double f = scan.nextDouble();
            Point2D p = new Point2D(arr[0][0], arr[0][1]);
            arr = Shear.shear(arr, p, f);
            Point2D p0 = new Point2D(arr[0][0], arr[0][1]);
            Point2D p1 = new Point2D(arr[1][0], arr[1][1]);
            Point2D p2 = new Point2D(arr[2][0], arr[2][1]);
            Point2D p3 = new Point2D(arr[3][0], arr[3][1]);
            Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
            Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
            Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
            root.getChildren().add(line1);
            root.getChildren().add(line2);
            root.getChildren().add(line3);
            root.getChildren().add(line4);
            stage.setScene(scene);
            stage.show();
        }
        if (count == 5) {
            System.out.println("Введите угол поворота:");
            double angle = scan.nextDouble();
            Point2D p = new Point2D(arr[0][0], arr[0][1]);
            arr = Spin.spin(arr, p, angle);
            Point2D p0 = new Point2D(arr[0][0], arr[0][1]);
            Point2D p1 = new Point2D(arr[1][0], arr[1][1]);
            Point2D p2 = new Point2D(arr[2][0], arr[2][1]);
            Point2D p3 = new Point2D(arr[3][0], arr[3][1]);
            Line line1 = new Line(p0.getX(), p0.getY(), p1.getX(), p1.getY());
            Line line2 = new Line(p0.getX(), p0.getY(), p2.getX(), p2.getY());
            Line line3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            Line line4 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
            root.getChildren().add(line1);
            root.getChildren().add(line2);
            root.getChildren().add(line3);
            root.getChildren().add(line4);
            stage.setScene(scene);
            stage.show();
        }


    }
}

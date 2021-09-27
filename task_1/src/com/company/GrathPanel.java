package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class GrathPanel extends JPanel {
    private static final long serialVersionUID = 6791888953399961746L;

    private Line line;
    private Rectangle rectangle;
    private Circle circle;
    private Arc arc;
    private Line pointLine;

    public GrathPanel(){
        line = new Line(15, 20, 150, 68);
        rectangle = new Rectangle(170, 200, 100, 100);
        circle = new Circle(80, 90, 100, 50);
        arc = new Arc(280, 100, 80, 150, 15, 165, Arc2D.CHORD);
        pointLine = new Line(280, 180, 280, 180);
    };

    @Override
    public void paintComponent(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.draw(line);
        graphics2D.setColor(Color.BLUE);
        graphics2D.draw(rectangle);
        graphics2D.fillRect(170, 200, 100, 100);
        graphics2D.draw(circle);
        graphics2D.draw(arc);
        graphics2D.fill(arc);
        graphics2D.setColor(Color.GREEN);
        graphics2D.draw(pointLine);


    }

    }


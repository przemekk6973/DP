package DesignPatterns.Decorator;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class TriangleShape implements BaseShape {

    public Shape shape;

    public TriangleShape() {
        this.shape = new Polygon(300, 200, 300, 400, 400, 300);
        this.shape.setFill(Color.TRANSPARENT);
        this.shape.setStrokeWidth(5);
        this.shape.setStroke(Color.BLACK);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }
}
package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class CircleShape implements BaseShape {

    public Shape shape;

    public CircleShape() {
            this.shape = new Circle(300, 300, 100);
            this.shape.setStrokeWidth(5);
            this.shape.setFill(Color.TRANSPARENT);
            this.shape.setStroke(Color.BLACK);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }
}
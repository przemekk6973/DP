package DesignPatterns.Decorator;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class SquareShape implements BaseShape {

    public Shape shape;

    public SquareShape() {
        this.shape = new Rectangle(200, 200, 200, 200);
        this.shape.setFill(Color.TRANSPARENT);
        this.shape.setStrokeWidth(5);
        this.shape.setStroke(Color.BLACK);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }
}
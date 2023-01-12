package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class RedDecorator extends ShapeDecorator {

    public RedDecorator(BaseShape decoratedShape) {
        this.decoratedShape = decoratedShape;
        draw();
    }

    @Override
    public Shape getShape(){
        return super.decoratedShape.getShape();
    }

    @Override
    public void draw(){
        this.getShape().setStroke(Color.RED);
    }
}
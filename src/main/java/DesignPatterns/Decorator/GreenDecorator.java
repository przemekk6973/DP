package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class GreenDecorator extends ShapeDecorator {

    public GreenDecorator(BaseShape decoratedShape) {
        this.decoratedShape = decoratedShape;
        draw();
    }

    @Override
    public Shape getShape(){
        return super.decoratedShape.getShape();
    }

    @Override
    public void draw(){
        this.getShape().setStroke(Color.GREEN);
    }
}
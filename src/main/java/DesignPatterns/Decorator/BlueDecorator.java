package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class BlueDecorator extends ShapeDecorator {

    public BlueDecorator(BaseShape decoratedShape) {
        this.decoratedShape = decoratedShape;
        draw();
    }

    @Override
    public Shape getShape(){
        return super.decoratedShape.getShape();
    }

    @Override
    public void draw(){
        this.getShape().setStroke(Color.BLUE);
    }
}
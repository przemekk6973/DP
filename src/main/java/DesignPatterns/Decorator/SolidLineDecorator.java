package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;

public class SolidLineDecorator extends ShapeDecorator {

    public SolidLineDecorator(BaseShape decoratedShape) {
        this.decoratedShape = decoratedShape;
        draw();
    }

    @Override
    public Shape getShape(){
        return super.decoratedShape.getShape();
    }

    @Override
    public void draw(){
        this.getShape().getStrokeDashArray().clear();
    }
}
package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;

public class DottedLineDecorator extends ShapeDecorator {

    public DottedLineDecorator(BaseShape decoratedShape) {
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
        this.getShape().getStrokeDashArray().addAll(1.0, 15.0);
    }
}
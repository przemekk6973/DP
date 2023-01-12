package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;

public class DashedLineDecorator extends ShapeDecorator {

    public DashedLineDecorator(BaseShape decoratedShape) {
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
        this.getShape().getStrokeDashArray().addAll(25.0, 25.0);
    }
}
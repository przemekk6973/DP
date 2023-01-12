package DesignPatterns.Decorator;

import javafx.scene.shape.Shape;

public abstract class ShapeDecorator implements BaseShape {
    protected BaseShape decoratedShape;
    public abstract Shape getShape();
    public abstract void draw();
}
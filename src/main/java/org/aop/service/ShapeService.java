package org.aop.service;

import org.aop.model.Circle;
import org.aop.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}

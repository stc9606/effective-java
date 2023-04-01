package com.scnoh.java.practice4.item23;

public class TaggedFigure {
    enum Shape { RECTANGLE, CIRCLE };

    // 태그 필드 - 현재 모양을 나타낸다.
    final Shape shape;

    // 다음 필드들은 모양이 사각형일 때만 쓰인다.
    double length;
    double width;

    // 다음 필드들은 모양이 원일 때만 쓰인다.
    double radius;

    TaggedFigure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    TaggedFigure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }

}

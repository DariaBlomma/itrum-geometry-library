package com.example.geometry;

public interface BaseFigure {
    default String getColor() {
        return "purple";
    }
    double getArea();
    double getPerimeter();
}

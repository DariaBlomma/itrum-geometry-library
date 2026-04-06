package com.example.geometry;

public interface BaseFigure {
    default String getColor() {
        return "purple";
    }
    default void oldMethod() {
        System.out.println("Hello from core 1.0.0");
    }
    double getArea();
    double getPerimeter();
}

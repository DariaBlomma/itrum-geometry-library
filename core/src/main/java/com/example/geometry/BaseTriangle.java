package com.example.geometry;

public class BaseTriangle implements BaseFigure {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    private BaseTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static BaseTriangle create(double sideA, double sideB, double sideC) throws IllegalArgumentException {
        if (sideA + sideB <= sideC ||
                sideA + sideC <= sideB ||
                sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Треугольник не существует");
        }
        return new BaseTriangle(sideA, sideB, sideC);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

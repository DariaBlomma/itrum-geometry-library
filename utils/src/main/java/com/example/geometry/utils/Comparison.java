package com.example.geometry.utils;

import com.example.geometry.BaseFigure;
import com.example.geometry.BaseTriangle;

public class Comparison {
    /**
     * Сравнивает две фигуры по площади.
     * @return 1, -1 или 0
     */
    int compareByArea(BaseFigure a, BaseTriangle b) {
        double area1 = a.getArea();
        double area2 = b.getArea();

        return Double.compare(area1, area2);
    }
}

package com.example.geometry.utils;

import com.example.geometry.BaseFigure;

public class FiguresComparison {
    /**
     * Compares two figures by area
     * @return 1, -1 или 0
     */
     public static int compareByArea(BaseFigure a, BaseFigure b) {
        double area1 = a.getArea();
        double area2 = b.getArea();

        return Double.compare(area1, area2);
    }

    /**
     * Compares two figures by perimeter
     * @return 1, -1 или 0
     */

    public static int compareByPerimeter(BaseFigure a, BaseFigure b) {
        double area1 = a.getPerimeter();
        double area2 = b.getPerimeter();

        return Double.compare(area1, area2);
    }

    public static void printOldMessage(BaseFigure figure) {
        figure.oldMethod();   // использует метод из core 1.0.0
    }
}

package geometry;

public class BaseRectangle implements  BaseFigure {
    private final double width;
    private final double height;

    private BaseRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static BaseRectangle create(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }

        return new BaseRectangle(width, height);
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

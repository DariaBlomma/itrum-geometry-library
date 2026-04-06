package geometry;

public class BaseCircle implements BaseFigure {
    private final double radius;

    private BaseCircle(double radius) {
        this.radius = radius;
    }

    public static BaseCircle create(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        return  new BaseCircle(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

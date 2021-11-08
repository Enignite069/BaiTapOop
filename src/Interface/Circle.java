package Interface;

public class Circle implements GeometricObject {
    private Point center;
    private double radius;

    public static final double pi = 3.14;

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Interface.Circle for what.
     *
     * @param center for centre.
     * @param radius for r.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * tinh dien tich.
     *
     * @return dien tich.
     */
    public double getArea() {
        return pi * radius * radius;
    }

    /**
     * tinh chu vi.
     *
     * @return chu vi.
     */
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    /**
     * dua thong tin.
     *
     * @return information.
     */
    public String getInfo() {
        return "Interface.Circle[(" + String.format("%.2f", center.getPointX())
                + ',' + String.format("%.2f", center.getPointY())
                + "),r=" + String.format("%.2f", radius) + ']';
    }
}

package DaHinh1;

public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2.0 * Math.PI;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Đưa ra hình tròn.
     *
     * @return radius, color and filled.
     */
    @Override
    public String toString() {
        return "Interface.Circle["
                + "radius=" + radius
                + ",color=" + color
                + ",filled=" + filled
                + "]";
    }
}

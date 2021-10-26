package DaHinh1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * Dưa ra hình dạng.
     *
     * @return shape format.
     */
    @Override
    public String toString() {
        return "Shape["
                + "color=" + color
                + ",filled=" + filled
                + ']';
    }
}


package DaHinh1;

public class Square extends Rectangle {
    public Square() {

    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }


    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    /**
     * Hinh vuong.
     *
     * @return square format.
     */
    @Override
    public String toString() {
        return "Square["
                + "side=" + length
                + ",color=" + color
                + ",filled=" + filled
                + "]";
    }
}


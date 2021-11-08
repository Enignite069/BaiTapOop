package Interface;

public class Point {
    private double pointX;
    private double pointY;

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * for what.
     *
     * @param x for x.
     * @param y for y.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * Ham tinh khoang canh.
     *
     * @param other toa do can tinh.
     * @return khoang canh.
     */
    public double distance(Point other) {
        double xdff = this.pointX - other.getPointX();
        double ydff = this.pointY - other.getPointY();
        return Math.sqrt(xdff * xdff + ydff * ydff);
    }
}

package Interface;

import Interface.GeometricObject;
import Interface.Point;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * tinh dien tich.
     *
     * @return area.
     */
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY()) - p2.getPointY()) / 2;
    }

    /**
     * chu vi.
     *
     * @return perimeter.
     */
    public double getPerimeter() {
        double s1 = Math.sqrt((p1.getPointX() - p2.getPointX()) * (p1.getPointX() - p2.getPointX())
                + (p1.getPointY() - p2.getPointY()) * (p1.getPointY() - p2.getPointY()));
        double s2 = Math.sqrt((p2.getPointX() - p3.getPointX()) * (p2.getPointX() - p3.getPointX())
                + (p2.getPointY() - p3.getPointY()) * (p2.getPointY() - p3.getPointY()));
        double s3 = Math.sqrt((p1.getPointX() - p3.getPointX()) * (p1.getPointX() - p3.getPointX())
                + (p1.getPointY() - p3.getPointY()) * (p1.getPointY() - p3.getPointY()));
        return s1 + s2 + s3;
    }

    /**
     * thong tin.
     *
     * @return info.
     */
    public String getInfo() {
        return "Interface.Triangle[(" + String.format("%.2f", p1.getPointX()) + ','
                + String.format("%.2f", p1.getPointY()) + "),("
                + String.format("%.2f", p2.getPointX()) + ','
                + String.format("%.2f", p2.getPointY()) + "),("
                + String.format("%.2f", p3.getPointX()) + ','
                + String.format("%.2f", p3.getPointY()) + ")]";
    }

    /**
     * for what.
     *
     * @param p1 as first.
     * @param p2 as second.
     * @param p3 as third.
     * @throws RuntimeException as exception.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}

package Dahinh2;

public class Point {
    protected double pointX;
    protected double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Point) {
            Point another = (Point) obj;
            if(this.pointX == another.pointX && this.pointY == another.pointY) {
                return true;
            }
        }
        return false;
    }
}

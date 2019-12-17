package junitTest;

/**
 * Created by CHEN on 2019/12/10.
 */

public class Point2d {
    private double x;
    private double y;

    public Point2d()
    {
        this(0, 0);
    }

    public Point2d(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

}


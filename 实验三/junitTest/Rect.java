package junitTest;

/**
 * Created by CHEN on 2019/12/10.
 */
public class Rect {

    private Point2d topLeft;
    private double width;
    private double height;

    public Rect() {
        topLeft = new Point2d( );
        width = 1;
        height = 1;
    }

    public Rect(Point2d topLeft) {
        if (topLeft != null)
            this.topLeft = topLeft;
        else
            this.topLeft = new Point2d( );
        width = 1;
        height = 1;
    }

    public Rect(Point2d topLeft, double width, double height) {
        if (topLeft != null)
            this.topLeft = topLeft;
        else
            this.topLeft = new Point2d( );
        if (width > 0)
            this.width = width;
        else
            this.width = 1;
        if (height > 0)
            this.height = height;
        else
            this.height = 1;
    }

    public boolean inRect(Point2d point2d) {
        if (point2d != null) {
            return (point2d.getX( ) < this.topLeft.getX( ) && point2d.getX( ) > this.topLeft.getX( ) - width &&
                    point2d.getY( ) < this.topLeft.getY( ) && point2d.getY( ) > this.topLeft.getY( ) - height);
        }
        return false;
    }

    public Point2d getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point2d topLeft) {
        this.topLeft = topLeft;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }


    @Override
    public String toString() {
        return "Rect{" +
                "topLeft=" + topLeft +
                ", width=" + width +
                ", height=" + height +
                '}';
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

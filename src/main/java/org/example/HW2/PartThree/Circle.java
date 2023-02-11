package org.example.HW2.PartThree;

public class Circle {
    private double r;
    private Point center;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", center=" + center +
                '}';
    }
}

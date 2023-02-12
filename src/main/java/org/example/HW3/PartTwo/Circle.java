package org.example.HW3.PartTwo;

public class Circle implements Comparable {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.radius == circle.radius)
            return 0;
        else if (this.radius > circle.radius)
            return 1;
        else if (this.radius < circle.radius)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

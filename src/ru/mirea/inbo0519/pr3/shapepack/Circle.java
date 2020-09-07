package ru.mirea.inbo0519.pr3.shapepack;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle()
    {
        super();
        radius =0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    public String toString()
    {
        return "Shape: circle, radius: " + radius + " color: " + color;
    }
}

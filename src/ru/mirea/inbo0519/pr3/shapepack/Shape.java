package ru.mirea.inbo0519.pr3.shapepack;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape()
    {
        color = "colorless";
        filled = false;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled()
    {
        return filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override
    abstract public String toString();
}

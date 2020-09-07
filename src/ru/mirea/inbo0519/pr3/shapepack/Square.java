package ru.mirea.inbo0519.pr3.shapepack;

public class Square extends Rectangle{
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super();
    }

    public double getSide()
    {
        return super.length;
    }

    public void setSide(double side)
    {
        super.length = side;
        super.width = side;
    }

    public double getArea()
    {
        return width*width;
    }

    public double getPerimeter()
    {
        return 4*width;
    }

    public String toString()
    {
        return "Shape: square, side: " + width + " color: " + color;
    }
}

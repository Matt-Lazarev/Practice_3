package ru.mirea.inbo0519.pr3.movablepack;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp()
    {
        center.y+=ySpeed;
    }

    public void moveDown()
    {
        center.y-=ySpeed;
    }

    public void moveRight()
    {
        center.x+=xSpeed;
    }

    public void moveLeft()
    {
        center.x-=xSpeed;
    }

    public String toString()
    {
        return "Class: MovableCircle xSpeed: " + xSpeed + " ySpeed: " + ySpeed +
                " radius: " + radius + " center: " + "(" + center.x + ", " + center.y + ").";
    }
}

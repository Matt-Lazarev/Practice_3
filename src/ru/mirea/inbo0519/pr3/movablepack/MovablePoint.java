package ru.mirea.inbo0519.pr3.movablepack;

public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp()
    {
        y+=ySpeed;
    }

    public void moveDown()
    {
        y-=ySpeed;
    }

    public void moveRight()
    {
        x+=xSpeed;
    }

    public void moveLeft()
    {
        x-=xSpeed;
    }

    public String toString()
    {
        return "Class: MovablePoint  (" + x + ", " + y + "), xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }
}

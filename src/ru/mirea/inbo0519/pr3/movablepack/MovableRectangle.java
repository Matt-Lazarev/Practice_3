package ru.mirea.inbo0519.pr3.movablepack;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super((x1+x2)/2, (y1+y2)/2, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp()
    {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    public void moveDown()
    {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveRight()
    {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public void moveLeft()
    {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    public boolean checkSpeed()
    {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    public String toString()
    {
        return "Class: MovableRectangle topLeft: (" + topLeft.x + ", " + topLeft.y + "), bottomRight: (" + bottomRight.x +
                ", " + bottomRight.y +
                "), xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }
}

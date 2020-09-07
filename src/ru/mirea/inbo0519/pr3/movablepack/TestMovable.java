package ru.mirea.inbo0519.pr3.movablepack;

public class TestMovable {
    public static void main(String[] args)
    {
        MovablePoint mp = new MovablePoint(10, 10, 2, 4);
        System.out.println(mp);
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp);

        MovableCircle mc = new MovableCircle(15, 15, 5, 7, 20);
        System.out.println("\n" + mc);
        mc.moveUp();
        mc.moveRight();
        System.out.println(mc);

        MovableRectangle mr = new MovableRectangle(10, 10, 0, 0, 5, 3);
        if(mr.checkSpeed()){
            System.out.println("\nSpeeds are equal");
        }
        else{
            System.out.println("Speeds aren't equal, FIX!!!!!!");
            return;
        }
        System.out.println(mr);
        mr.moveDown();
        mr.moveRight();
        System.out.println(mr);
    }
}

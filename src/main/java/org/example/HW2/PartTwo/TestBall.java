package org.example.HW2.PartTwo;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball = new Ball();
        System.out.println("ball created: " + ball);
        System.out.println("enter x and y of ball: ");
        double x,y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball.setX(x);
        ball.setY(y);
        System.out.printf("ball's x position = %.2f\tball's y position = %.2f\n",ball.getX(),ball.getY());
        System.out.println("enter another x and y - position of second ball: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Ball ball2 = new Ball(x,y);
        System.out.println("second ball created: " + ball2);
        System.out.println("enter xDisp and yDisp: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball2.move(x,y);
        System.out.printf("new position x of second ball = %.2f\tnew position y of second ball = %.2f\n", ball2.getX(),ball2.getY());
        Ball ball3 = new Ball();
        System.out.println("third ball created: " + ball3);
        System.out.println("enter another x and y - position of third ball: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball3.setXY(x,y);
        System.out.printf("new position x of third ball = %.2f\tnew position y of third ball = %.2f\n",ball3.getX(),ball3.getY());



    }
}

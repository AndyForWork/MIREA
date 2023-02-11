package org.example.HW2.PartSix;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args)
    {
        System.out.println("Enter position of the first circle and its radius (x,y,r):");
        double x,y,r;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        r = scanner.nextDouble();
        Circle circle1 = new Circle(x,y,r);
        System.out.println("circle 1 created: "+ circle1);
        System.out.println("Enter position of the second circle and its radius (x,y,r):");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        r = scanner.nextDouble();
        Circle circle2 = new Circle(x,y,r);
        System.out.println("circle 2 created: "+ circle2);
        if (circle2.equals(circle1))
            System.out.println("circles are equals");
        else if (circle1.compareTo(circle2)) {
            System.out.println("square of circle 1 is larger than square of circle 2");
        }
        else
            System.out.println("square of circle 2 is larger than square of circle 1");

    }
}

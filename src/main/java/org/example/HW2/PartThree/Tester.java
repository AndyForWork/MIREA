package org.example.HW2.PartThree;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount of circles");
        n = scanner.nextInt();
        Circle[] circles = new Circle[n];
        System.out.println("enter data about circles (x and y - center of circle and r - radius of circle):");
        for(int i=0;i<n;i++)
        {
            double x,y,r;
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            r = scanner.nextDouble();
            circles[i] = new Circle(r,new Point(x,y));
        }
        System.out.println("info about your circles:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d - %s\n",i+1,circles[i]);
        }
    }
}

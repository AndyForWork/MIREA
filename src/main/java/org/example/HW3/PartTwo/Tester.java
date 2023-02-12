package org.example.HW3.PartTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    private static int count;
    private static Circle circle[];
    public static void main(String[] args) {
        System.out.print("enter array's length: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        circle = new Circle[count];
        Random random = new Random(System.nanoTime());
        for(int i=0;i<count;i++){
            circle[i] = new Circle(random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        System.out.println("maximum circle in array is "+ max());
        System.out.println("minimum circle in array is "+ min());
        sort();
        System.out.println("sorted array:\n"+Arrays.toString(circle));

    }

    public static Circle max(){
        if(circle == null)
            return null;
        Circle maximumCircle = circle[0];
        for(int i=1;i<count;i++) {
            if(maximumCircle.compareTo(circle[i])==-1)
                maximumCircle = circle[i];
        }
        return maximumCircle;
    }

    public static Circle min(){
        if(circle == null)
            return null;
        Circle minimumCircle = circle[0];
        for(int i=1;i<count;i++) {
            if(minimumCircle.compareTo(circle[i])==1)
                minimumCircle = circle[i];
        }
        return minimumCircle;
    }

    public static void sort(){
        if (circle == null)
            return;
        Arrays.sort(circle);
    }


}

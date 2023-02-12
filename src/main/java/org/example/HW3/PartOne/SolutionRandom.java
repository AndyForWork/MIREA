package org.example.HW3.PartOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SolutionRandom {
    public static  void  main(String[] args) {
        System.out.print("enter array's length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        double rand[] = new double[length];
        Random random = new Random();
        for(int i=0;i<length;i++)
        {
            rand[i] = random.nextDouble();
        }
        System.out.println("generated array: ");
        System.out.println(Arrays.toString(rand));
        Arrays.sort(rand);
        System.out.println("sorted array: ");
        System.out.println(Arrays.toString(rand));
    }
}

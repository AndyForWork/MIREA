package org.example.HW1;

import java.util.Scanner;

public class PartThree {
    public static void main(String[] argc)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        float average;
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        average = (float)sum/n;
        System.out.printf("average of array's elements: %f\nsum of elements of array: %d",average, sum);
    }
}

package org.example.HW1;

import java.util.Scanner;

public class PartFour {
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i<n)
        {
            arr[i] = scanner.nextInt();
            i++;
        }
        int sum = 0, max = arr[0], min = arr[0];
        i = 0;
        while(i<n)
        {
            sum+=arr[i];
            if (max<arr[i])
                max = arr[i];
            if (min>arr[i])
                min = arr[i];
            i++;
        }
        System.out.printf("sum of array elements = %d\nmaximum of array elements = %d\nminimum of array elements = %d",sum,max,min);
    }
}

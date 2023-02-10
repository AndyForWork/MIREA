package org.example.HW1;

import java.util.Scanner;

public class PartSeve {
    public static void main(String[] argc)
    {
        System.out.print("enter an integet: ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.printf("factorial of %d is %d",n, fact(n));

    }

    public static int fact(int n)
    {
        int res = 1;
        for(int i=1;i<=n;i++)
        {
           res*=i;
        }
        return res;
    }

}

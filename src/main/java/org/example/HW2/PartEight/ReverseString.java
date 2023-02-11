package org.example.HW2.PartEight;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        System.out.println("enter array's length: ");
        int length;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        String strings[] = new String[length];
        System.out.println("enter elements of string array:");
        for(int i=0;i<length;i++){
            strings[i] = scanner.next();
        }
        for(int i=0;i<length/2;i++)
        {
            String dop = strings[i];
            strings[i] = strings[length-i-1];
            strings[length-i-1] = dop;
        }
        System.out.println("reversed array:");
        for(int i = 0;i<length;i++)
        {
            System.out.print(strings[i]+" ");
        }
    }
}

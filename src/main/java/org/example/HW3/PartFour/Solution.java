package org.example.HW3.PartFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        System.out.print("enter array's length: ");
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        length = scanner.nextInt();
        while (length<=0){
            System.out.print("you entered uncorrect length, please try again: ");
            length = scanner.nextInt();
        }
        int array[] = new int[length];
        for (int i=0;i<length;i++) {
            array[i] = new Random().nextInt(0,length+1);
        }
        System.out.println("generated array:\n" + Arrays.toString(array));
        int array2[] = new int[length];
        int count = 0;
        for (int i=0;i<length;i++){
            if (array[i]%2==0) {
                array2[count] = array[i];
                count++;
            }
        }
        System.out.println("array of even elements:\n"+Arrays.toString(Arrays.copyOfRange(array2,0,count)));
    }
}

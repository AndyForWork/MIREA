package org.example.HW3.PartThree;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args){
        int array[] = new int[4];
        for (int i=0;i<4;i++)
            array[i] = new Random().nextInt(1,100);
        System.out.println("Generated array:");
        System.out.println(Arrays.toString(array));
        boolean isIncreasing = true;
        for (int i=1;i<4;i++){
            if (array[i]<=array[i-1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("array is increasing sequence");
        }
        else {
            System.out.println("array isn't increasing sequence");
        }
    }
}

package org.example.HW3.PartFive;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {

    public static double converter[][] = {{1,72.79,0.9365,131.36},
                                          {0.013738,1,0.012812,1.81},
                                          {1.07,78.05,1,139.88},
                                          {0.007613,0.553,0.007149,1}};

    public static void main(String[] args){
        System.out.println("Enter your type of money: (1 - dollar, 2 - ruble, 3 -euro, 4 -yen)");
        int type1;
        Scanner scanner = new Scanner(System.in);
        type1 = scanner.nextInt();
        while (type1 < 1 || type1 > 4){
            System.out.print("you entered wrong type, please try again: ");
            type1 = scanner.nextInt();
        }
        System.out.print("Enter your amount of money: ");
        double money = scanner.nextInt();
        while (money < 0){
            System.out.print("you entered wrong amount of money, please try again: ");
            money = scanner.nextDouble();
        }
        System.out.println("Enter type of money, that you want to calculate(1 - dollar, 2 - ruble, 3 -euro, 4 -yen)");
        int type2 = scanner.nextInt();
        while (type2 < 1 || type2 > 4){
            System.out.print("you entered wrong type, please try again: ");
            type2 = scanner.nextInt();
        }
        NumberFormat numberFormat = null;
        switch (type1){
            case 1:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
                break;
            case 2:
                numberFormat = NumberFormat.getCurrencyInstance(new Locale("ru"));
                break;
            case 3:
                numberFormat = NumberFormat.getCurrencyInstance(new Locale("eu"));
                break;
            case 4:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
                break;
        }
        System.out.print(numberFormat.format(money) + " = ");
        switch (type2){
            case 1:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
                break;
            case 2:
                numberFormat = NumberFormat.getCurrencyInstance(new Locale("ru"));
                break;
            case 3:
                numberFormat = NumberFormat.getCurrencyInstance(new Locale("eu"));
                break;
            case 4:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
                break;
        }

        System.out.print(numberFormat.format(money*converter[type1-1][type2-1]));

    }
}

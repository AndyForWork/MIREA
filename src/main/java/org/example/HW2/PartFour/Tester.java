package org.example.HW2.PartFour;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Enter \"add\" to add computer to the shop\n" +
                           "Enter \"delete\" to delete computer from the shop\n" +
                           "Enter \"check\" to check if computer exists in shop\n" +
                           "Enter \"exit\" to stop this programm");
        boolean stay = true;
        Shop shop = new Shop();
        while (stay)
        {
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.next();
            String name;
            switch (cmd)
            {
                case "add":
                    System.out.println("enter computers name: ");
                    name = scanner.next();
                    shop.addComputer(name);
                    break;
                case "delete":
                    System.out.println("enter name of computer that you whants to delete: ");
                    name = scanner.next();
                    shop.deleteComputer(name);
                    break;
                case "check":
                    System.out.println("enter name of computer that you whants to check: ");
                    name = scanner.next();
                    boolean res = shop.isComputerExists(name);
                    if (res)
                        System.out.println("computer exists");
                    else
                        System.out.println("computer doesn't exist");
                    break;
                case "exit":
                    stay = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("you entered wrong data. please enter correct data.");

            }
        }
    }
}

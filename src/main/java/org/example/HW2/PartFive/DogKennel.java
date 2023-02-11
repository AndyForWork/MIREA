package org.example.HW2.PartFive;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    private static ArrayList<Dog> dogs = new ArrayList<>();

    public static void addDog(Dog ... dogsToAdd)
    {
        for(int i=0;i<dogsToAdd.length;i++)
            dogs.add(dogsToAdd[i]);
        System.out.println("Dogs succesfully added");
    }

    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter amount of dogs that you whants to add: ");
        n = scanner.nextInt();
        Dog[] dogsToAdd = new Dog[n];
        System.out.println("enter info about every dog (name and age)");
        for (int i=0;i<n;i++)
        {
            int age;
            String name;
            name = scanner.next();
            age = scanner.nextInt();
            dogsToAdd[i] = new Dog(name,age);
        }
        addDog(dogsToAdd);
        System.out.println("age of dogs in human years:");
        for(int i=0;i<dogs.size();i++)
        {
            System.out.println(dogs.get(i) +" - " + dogs.get(i).toHumanAge());
        }
    }
}

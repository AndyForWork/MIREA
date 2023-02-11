package org.example.HW2.PartNine;

import java.util.Scanner;

public class Pocker {
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        deck.shufle();
        System.out.println("how many players in this game?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        deck.getCards(count);
    }
}

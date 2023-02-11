package org.example.HW2.PartNine;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    List<Card> cards = new ArrayList<Card>();
    public Deck(){
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<4;j++)
            {
                cards.add(new Card(type.values()[i],suit.values()[j]));
            }
        }
    }
    public void shufle(){
        Collections.shuffle(cards, new Random(System.nanoTime()));
    }

    public void getCards(int count){
        if(count>6)
            System.out.println("too many players, sorry... game doesn't starts");
        else{
            for(int i=0;i<count;i++)
            {
                for(int j=0;j<5;j++)
                    System.out.print(cards.get(i+5*j)+" ");
                System.out.println("\n");
            }
        }
    }
}

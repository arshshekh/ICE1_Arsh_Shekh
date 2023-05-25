/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @author arshshekh  StudentId: 991676386
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        public static final Card luckyCard = new Card("7", "Hearts"); 
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(1+Math.random()*13));
            c.setSuit(Card.SUITS[(int)(0+Math.random()*4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            magicHand [i] = c;
            
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick any card:");
        int CardValue = input.nextInt();
        
        System.out.println("Please pick the suit:");
        String CardSuit = input.next();
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("You picked "+CardValue+ "and suit" + CardSuit );
    }
    
}

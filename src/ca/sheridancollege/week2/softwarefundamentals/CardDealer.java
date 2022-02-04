/*
 * Programmer: Gregory Lee Wo
 * Date: 04 Feburary 2022
 * Student ID: 991 638 141
 * Project: CardCode
 * Create a new CardDealer class
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Gregory Lee Wo, 04 Feb 2022s
 */
public class CardDealer {
    
    public static void main(String[] args) {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("diamonds");
        Card aceHearts = new Card("Hearts", 1);
        Sysstem.out.println(aceHearts.getSuit());
        System.out.println(aceHearts.getValue());
    }
    
}

/**
 * Code for Class.
 *
 * <p>
 * The problem is to write a program that picks four cards randomly from a deck of 52 cards. All the
 * cards can be represented using an array named deck, filled with initial values 0 to 51.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program02 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    deckOfCards();
  }


  /**
   * This method generates a deck of cards and then picks 4 at random.
   */
  public static void deckOfCards() {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Display the first four cards
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
    }
  }
}

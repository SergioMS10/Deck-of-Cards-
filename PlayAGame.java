
import java.util.Scanner;

// Filename: PlayAGame.java
// Description: Card class representing a playing card
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026
public class PlayAGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Shall we play a game?");
        
        DeckOfCards myDeck = new DeckOfCards();
        DeckOfCards discardPile = new DeckOfCards();

        myDeck.fillDeck();
        myDeck.shuffleDeck();

        System.out.println("How many cards would you like?");
        int numCardsToDraw = input.nextInt();
        System.out.println();

        Card[] playerHand = new Card[numCardsToDraw];

        System.out.println("Drawing " + numCardsToDraw + " cards...");
        System.out.println();
        System.out.println("My hand: ");

        for (int i = 0; i < numCardsToDraw; i++) {
            playerHand[i] = myDeck.drawCard();
            System.out.println(playerHand[i]);
        }

        System.out.println();
        System.out.println("Looking at the deck:");
        System.out.println(myDeck);
        System.out.println();

        System.out.println("Returning the card to the discard pile");

        for (int i = 0; i < numCardsToDraw; i++) {
            discardPile.putCardOnTop(playerHand[i]);
        }

        System.out.println("Discard pile:" + discardPile);


        //BlackJack game
        
        System.out.println();
        CardGame game = new BlackJack();
        game.setupGame();
        game.runSimulation();
        game.printResults();

    }

}

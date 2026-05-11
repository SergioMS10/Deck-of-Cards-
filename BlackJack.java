// Filename: BlackJack.java
// Description: 
// Author: Sergio Martinez Sanz
// Date Modified: 01/30/2026

public class BlackJack extends DeckOfCards implements CardGame {

    private Card hand1[];
    private Card hand2[];
    private int roundsPlayed;
    private int player1Wins;
    private int player2Wins;
    private int ties;

    @Override
    public void setupGame() {
        System.out.println("Shall we play? (" + getClass().getSimpleName() + ")");
        System.out.println("");

        fillDeck();
        shuffleDeck();
        hand1 = new Card[4];
        hand2 = new Card[4];

        for (int i = 0; i < hand1.length; i++) {
            hand1[i] = drawCard();
            hand2[i] = drawCard();
        }

        roundsPlayed = 0;
        player1Wins = 0;
        player2Wins = 0;
        ties = 0;
    }


    @Override
    public void printResults() {
        System.out.println("");
        System.out.println("The game run for " + roundsPlayed + " rounds.");
        System.out.println("Player 1 won " + player1Wins + " times.");
        System.out.println("Player 2 won " + player2Wins + " times.");
        System.out.println("Players tied " + ties + " times.");
        System.out.println("");
    }

    @Override
    public void runSimulation() {
        for (int i = 0; i < hand1.length; i++) {
            Card card1 = hand1[i];
            Card card2 = hand1[i + 1];
            Card card3 = hand2[i];
            Card card4 = hand2[i + 1];
            
            roundsPlayed++;

            System.out.println("Draw #" + roundsPlayed + ": " + card1 + " and " + card2 + " versus " + card3 + " and " + card4);
            if (card1.getRank() + card2.getRank() > card3.getRank() + card4.getRank()) {
                System.out.println("Player 1 wins the round!");
                player1Wins++;
            } else if (card1.getRank() + card2.getRank() < card3.getRank() + card4.getRank()) {
                System.out.println("Player 2 wins the round!");
                player2Wins++;
            } else {
                System.out.println("It's a tie!");
                ties++;
            }

            
            System.out.println();
        }

    }

}

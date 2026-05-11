// Filename: Card.java
// Description: Card class representing a playing card
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026

public class Card implements Comparable<Card> {

    private int rank;
    private int suit;

    public final static String rankNames[] = {
        "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Jack", "Queen", "King"
    };
    public final static String suitNames[] = {
        "Clubs", "Spades", "Hearts", "Diamonds"
    };

    // Accessor Function for Rank
    public int getRank() {
        return rank;
    }

    // Accessor Function for Suit
    public int getSuit() {
        return suit;
    }

    //Constructor for Card
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Member Function to draw card
    public void drawCard() {
        rank = (int) (Math.random() * 13 + 1);
        suit = (int) (Math.random() * 4);
    }

    @Override
    public String toString() {
        return rankNames[rank - 1] + " of " + suitNames[suit];
    }

    @Override
    public boolean equals(Object that) {

        if (this == that) {
            return true;
        }

        if (!(that instanceof Card)) {
            return false;
        }

        if (((Card) that).getRank() == getRank()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Card that) {
        return Integer.compare(this.rank, that.rank);
    }
}

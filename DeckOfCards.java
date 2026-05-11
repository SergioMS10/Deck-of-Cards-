// Filename: DeckOfCards.java
// Description: Card class representing a playing card
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026

public class DeckOfCards extends LinkedStack<Card> {

    private int numCards = 0;

    public void fillDeck() {
        if (top != null) {
            throw new RuntimeException("Deck is not empty!");
        }

        numCards = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                push(new Card(rank, suit));
                numCards++;
            }
        }
    }

    public void shuffleDeck() {
        if (top == null) {
            throw new RuntimeException("Deck is empty!");
        }

        for (int i = 0; i < 52; i++) {
            int randIndex = (int) (Math.random() * 52);
            swap(i, randIndex);
        }
    }

    public Card drawCard() {
        if (top == null) {
            throw new RuntimeException("Deck is empty!");
        }

        numCards--;
        return pop();
    }

    public void putCardOnTop(Card card) {
        push(card);
        numCards++;
    }

    @Override
    public String toString() {
        String result = "";

        result += "(Number of cards left: " + numCards + ")\n";
        result += "Here's a peek at the deck: ";

        ListNode<Card> current = top;
        int index = 1;

        while (current != null) {
            result += index + ": " + current.getItem();

            if (current.getNext() != null) {
                result += " ";
            }

            current = current.getNext();
            index++;
        }

        return result;
    }

}

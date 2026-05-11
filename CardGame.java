// Filename: CardGame.java
// Description: Interface for a card game
// Author: Sergio Martinez Sanz
// Date Modified: 01/30/2026

public interface CardGame {

    // prepares all necessary data structures to start the simulation
    // sets all variables to default values
    void setupGame();

    // runs a full game simulation by repeatedly executing turns
    // by calling playTurn() several times
    void runSimulation();

    //prints the results of the simulation
    //includes: number of wins per player, ties and number of rounds
    void printResults();
}

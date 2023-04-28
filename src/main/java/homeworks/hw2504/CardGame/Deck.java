package homeworks.hw2504.CardGame;

import java.util.Random;

public class Deck {

    private final String[] deck;
    private final int numberOfCards;

    public Deck (int numberOfCards){
        deck = new String[numberOfCards];
        this.numberOfCards = numberOfCards;

    }

    // deck initialization
    public void create() {
        CardRank[] cardRanks = CardRank.values();
        CardSuit[] cardSuits = CardSuit.values();
        for (int i = 0; i < cardRanks.length; i++) {
            for (int j = 0; j < cardSuits.length; j++) {
                deck[cardSuits.length * i + j] = cardRanks[i] + " " + cardSuits[j];
            }
        }
    }

    // deck shuffling
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }

    // the shuffled deck is displayed
    public void display (int players, int cardsForPlayer){
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}

package homeworks.hw2504.CardGame;

import java.util.Scanner;

/**
 * сделать рефактор кода, разнести логику в отдельные классы, enums, методы.
 */
public class GamePlay {
    final static int cardsForPlayer = 5;
    static int players;
    final static Scanner sc = new Scanner(System.in);

    final static int numberOfCards = CardSuit.values().length * CardRank.values().length; // number of cards

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter the number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }

                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }

        }
        Deck deck = new Deck(numberOfCards);
        do {
            deck.create();
            deck.shuffle();
            deck.display(players, cardsForPlayer);
        } while (oneMoreDeal());

    }

    public static boolean oneMoreDeal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a new deal?\n"
                + "y - yes\n"
                + "n - no");
        char decision = scanner.nextLine().charAt(0);
        if (decision == 'n') {
            System.out.println("See you next time! :)");
        }
        return decision == 'y';
    }


}



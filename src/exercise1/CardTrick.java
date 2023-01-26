package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Randeep singh brar
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
            Random random =new Random();
            Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
             card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
  // ask user for card value and suit
        System.out.println("Pick a card value between 1 and 13:");
        int userValue = scanner.nextInt();
        System.out.println("Pick a card suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs):");
        int userSuit = scanner.nextInt() - 1;
        
        // create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        // search the hand for the match to the user's card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // if the guess is successful, print "Congratulations, you guessed right!"
        if (found) {
            System.out.println("Congratulations, you guessed right!");
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}

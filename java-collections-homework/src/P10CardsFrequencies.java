// Problem 10 Card Frequencies
//----------------------------------------------------------------------------------------------------------------------
// Takes a sequence of cards as input (example: 8♥ 2♣ 4♦ 10♦) and prints out all cards and their occursion chance in
// the given order.
//----------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class P10CardsFrequencies {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] cards = input.nextLine().split(" ");

        List<String> cardFaces = toListOfStrings(cards);    // List of Cards
        LinkedHashMap<String, Integer> cardRepeats = new LinkedHashMap<>();    // Linked HashMap to keep card keys in order.
        for (String element: cardFaces) {
            if (cardRepeats.get(element) != null) {     // Incrementing occurrence, or...
                int value = cardRepeats.get(element) + 1;
                cardRepeats.put(element, value);
            } else {    // Creating new entry
                cardRepeats.put(element, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : cardRepeats.entrySet()) {
            float a = ((float) entry.getValue() / (float) cards.length) * 100; // Occurrence in percentages.
            System.out.printf("%s -> %.2f%%%n", entry.getKey(), a);
        }
    }

    static List<String> toListOfStrings(String[] cards) {
        List<String> cardFaces = new ArrayList<>();
        String tempCard = "";
        for (String card : cards) {
            for (int i = 0, n = card.length() - 1; i < n; i++) {
                tempCard += card.toCharArray()[i];
            }
            cardFaces.add(tempCard);
            tempCard = "";
        }

        return cardFaces;
    }
}

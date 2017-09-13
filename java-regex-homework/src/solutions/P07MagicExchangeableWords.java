// Problem * 7 Magic exchangeable words.
//----------------------------------------------------------------------------------------------------------------------
// Takes two words as input, given on the same line, separate by space. Then checks if they can be Magic exchanged and
// prints the result. Exchangeable are words where the characters in the first string can be replaced to get the second
// string.
// Example: egg and add are exchangeable, but aabbccbb and nnooppzz are not.
//----------------------------------------------------------------------------------------------------------------------

package solutions;

import java.util.HashMap;
import java.util.Scanner;

public class P07MagicExchangeableWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            String[] words = input.nextLine().split(" ");
            while (words[0].length() != words[1].length()) {     // Validating user input.
                System.out.println("Enter two strings of equal size");
                words = input.nextLine().split(" ");
            }
            System.out.println(areMagicExchangeable(words[0], words[1]));
        } catch (ArrayIndexOutOfBoundsException e) {    // Validating user input.
            System.out.println("Usage: \"<string1> <string2>\" Both string must have equal lengths.");
        }
    }

    private static boolean areMagicExchangeable(String firstWord, String secondWord) {
        // Map to store 'firstWord' chars as 'magicKeys' and 'secondWord' chars as 'magicValues' to help determine if they are magic exchangeable
        HashMap<Character, Character> magicMap = new HashMap<>();
        char[] magicKeys = firstWord.toCharArray();
        char[] magicValues = secondWord.toCharArray();
        for (int i = 0, n = firstWord.length(); i < n; i++) {
            if (magicMap.get(magicKeys[i]) == null && !magicMap.containsValue(magicValues[i])) {
                magicMap.put(magicKeys[i], magicValues[i]);
            } else if (magicMap.get(magicKeys[i]) != null && magicMap.get(magicKeys[i]) == magicValues[i]) {    // This weird condition is necessary, because Java wouldn't allow all return statements to be inside if-else construction. If this is true we skip the last 'else', thus returning 'true'. If this is 'false' then we return 'false'. Debugging might help clarify further.
            } else {
                return false;
            }
        }
        return true;    // Return true if condition on line '39' is true.
    }
}

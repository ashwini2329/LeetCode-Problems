import java.util.HashMap;
import java.util.HashSet;

/**
 
You are given the strings key and message, which represent a cipher key and a secret message, 
respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the 
substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each 
letter in the alphabet), we have the partial substitution table of 
('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

 

Example 1:


Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps 
over the lazy dog".
Example 2:


Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
Output: "the five boxing wizards jump quickly"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
 

Constraints:

26 <= key.length <= 2000
key consists of lowercase English letters and ' '.
key contains every letter in the English alphabet ('a' to 'z') at least once.
1 <= message.length <= 2000
message consists of lowercase English letters and ' '.
 */


/******************************************
        2325. Decode the Message
******************************************/

public class problem2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        HashMap<Character, Character> pairing = new HashMap<>();
        int counter = 97;
        String reducedString = removeKeySpace(key);
        String resultString = "";
        HashSet<Character> visited = new HashSet<>();

        for(int i=0; i<reducedString.length(); i++){
            if(!visited.contains(reducedString.charAt(i))) {
                pairing.put(reducedString.charAt(i), (char)(counter));
                counter++;
                visited.add(reducedString.charAt(i));
            }
        }

        for(int i=0; i<message.length(); i++) {
            if(message.charAt(i) == ' ') {
                resultString += " ";
            } else {
                resultString += (pairing.get(message.charAt(i)));
            }
        }

        System.out.println("result String = " + resultString); // return resultString;
    }

    public static String removeKeySpace(String key) {
        String resultString = "";
        for(int i=0; i<key.length(); i++) {
            if(key.charAt(i) != ' ') {
                resultString += key.charAt(i);
            }
        }

        return resultString;
    }
}

import java.util.HashMap;
import java.util.HashSet;

/**

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

 

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 

Constraints:

1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.
 */



/*******************************************************************
        1160. Find Words That Can Be Formed by Characters
*******************************************************************/

public class findWords {
    public static void main(String[] args) {
        // Sample Input
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        int wordsLength = words.length;
        int charsLength = chars.length();

        HashSet<Character> visited = new HashSet<>();
        HashMap<String,Integer> charsMap = new HashMap<>();

        for(int i=0; i<charsLength; i++) {
            int count = 0;
            if(!visited.contains(chars.charAt(i))) {
                for(int j=0; j<charsLength; j++) {
                    if(Character.compare(chars.charAt(i), chars.charAt(j)) == 0) {
                        count++;
                    }
                }
                charsMap.put(Character.toString(chars.charAt(i)), count);
                visited.add(chars.charAt(i));
            }
        }

        int stringSum = 0;
        for(int i=0; i<wordsLength; i++) {
            if(isWordFormed(words[i], charsMap)) {
                stringSum += words[i].length();
            }
        }

        System.out.println("words count = " + stringSum);   // return stringSum;
    }

    /**
     * The function checks if a given word can be formed using the characters and their counts provided
     * in a HashMap.
     */
    public static boolean isWordFormed(String word, HashMap<String, Integer> charsMap) {
        int wordLength = word.length();
        boolean result = true;

        HashSet<Character> visited = new HashSet<>();
        
        for(int i=0; i<wordLength; i++) {
            int count = 0;
            if(!visited.contains(word.charAt(i))) {
                for(int j=0; j<wordLength; j++) {
                    if(Character.compare(word.charAt(i), word.charAt(j)) == 0) {
                        count++;
                    }
                }
                visited.add(word.charAt(i));
                if(charsMap.containsKey(Character.toString(word.charAt(i)))) {
                    if(!(charsMap.get(Character.toString(word.charAt(i))) >= count)) {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}

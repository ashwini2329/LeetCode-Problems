import java.util.ArrayList;

/**

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, 
or false otherwise.

 
Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */


/***********************************************************************
                1832. Check if the Sentence Is Pangram
************************************************************************/
public class panagramSentence {
    public static void main(String[] args) {
        String sentence = "leetcode is life";

        int strLength = sentence.length();
        ArrayList<Character> checkAlphabet = new ArrayList<>();
        for(int i=0; i<strLength; i++) {
            checkAlphabet.add(sentence.charAt(i));
        }
        
        boolean result = true;
        for(int i=97; i<=122; i++) {
            if(!checkAlphabet.contains((char) i)) {
                result = false;
                break;
            }
        }

        System.out.println("result == " + result);  // return result;
    }
}

/**
 ********************************************************************************
         1941. Check if All Characters Have Equal Number of Occurrences
 ********************************************************************************

Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
 */

import java.util.ArrayList;

public class checkChar {
    public static void main(String[] args) {
        String s = "aaabbb";
        int strLength = s.length();
        ArrayList<Character> charList = new ArrayList<Character>();
        ArrayList<Integer> occurencesCount = new ArrayList<Integer>();

        for(int i=0; i<strLength; i++) {
            char current = s.charAt(i);
            int count = 0;
            if(!charList.contains(current)) {
                charList.add(current);
                for(int j=i; j<strLength; j++) {
                    if(Character.compare(current, s.charAt(j)) == 0) {
                        count++;
                    }
                }
                occurencesCount.add(count);
            } else {
                continue;
            }
        }

        boolean isSame = true;
        int firstElement = occurencesCount.get(0);
        for(int i=0; i<occurencesCount.size(); i++) {
            if(occurencesCount.get(i) != firstElement) {
                isSame = false;
                break;
            }
        }

        if(isSame) {
            System.out.println(true);   // return true;
        } else {
            System.out.println(false);  // return false;
        }
    }
}

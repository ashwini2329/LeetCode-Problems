/**
 *******************************************************************
                 1768. Merge Strings Alternately
 *******************************************************************

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 starting with word1. If a string is longer than the other, append the additional letters onto the 
 end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */

public class mergeStrings {
    public static void main(String[] args) {
        // Sample Inputs
        String word1 = "ab", word2 = "pqrs";
        // String word1 = "abc", word2 = "pqr";
        // String word1 = "abcd", word2 = "pq";

        int word1Length = word1.length();
        int word2Length = word2.length();

        String mergedString = "";
        if(word1Length == word2Length) {
            mergedString += mergeString(word1, word2);
        } else {
            if(word1Length > word2Length) {
                String firstSubstring = word1.substring(0, word2Length);
                String lastSubstring = word1.substring(word2Length, word1Length);
                mergedString += mergeString(firstSubstring, word2);
                mergedString += lastSubstring;
            } else {
                String firstSubstring = word2.substring(0, word1Length);
                String lastSubstring = word2.substring(word1Length, word2Length);
                mergedString += mergeString(word1, firstSubstring);
                mergedString += lastSubstring;
            }
        }
        System.out.println("mergedString = " + mergedString);   // return mergedString
    }

    /**
     * function to return merged String
     * @param str1
     * @param str2
     * @return
     */
    public static String mergeString(String str1, String str2) {
        int strLength = str1.length();
        String mergeString = "";
        for(int i=0; i<strLength; i++) {
            mergeString += str1.charAt(i);
            mergeString += str2.charAt(i);
        }
        return mergeString;
    }
}

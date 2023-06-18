/**

You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character 
where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

 

Example 1:
Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.


Example 2:
Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation: 
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.
 

Constraints:
1 <= words.length <= 1000
1 <= words[i].length <= 10
words[i] consists of only lowercase English letters.
0 <= left <= right < words.length
 */

/*******************************************************************
  2586. Count the Number of Vowel Strings in Range
********************************************************************/

public class vowelStrings {
    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};      // Sample Input
        int left = 1, right = 4;
        int count = 0;

        for(int i=left; i<=right; i++) {
            String current = words[i];
            boolean isVowelString = vowelChecker(current);
            if(isVowelString) {
                count++;
            }
        }

        System.out.println("count = " + count);     // return count;
    }

    public static boolean vowelChecker(String str) {
        int strLength = str.length();
        char start = str.charAt(0);
        char end = str.charAt(strLength-1);

        if((Character.compare(start, 'a') == 0 || Character.compare(start, 'e') == 0 || 
        Character.compare(start, 'i') == 0 || Character.compare(start, 'o') == 0 ||
        Character.compare(start, 'u') == 0) && (Character.compare(end, 'a') == 0 || 
        Character.compare(end, 'e') == 0 || Character.compare(end, 'i') == 0 ||
        Character.compare(end, 'o') == 0 || Character.compare(end, 'u') == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

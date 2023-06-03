/**
 ****************************************************************************
 			Maximum Number of Vowels in a Substring of Given Length
 ****************************************************************************
 
 Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

Constraints:


1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
 */


import java.util.HashSet;
import java.util.Set;

public class countVowels {
	public static void main(String[] args) {
		String s = "abciiidef";
		int k = 3;
		
        Set<Character> vowelSet = new HashSet();
        vowelSet.add('a'); vowelSet.add('o'); vowelSet.add('i');
        vowelSet.add('u'); vowelSet.add('e');
        
        int count = 0;
        int maxCount = 0;
        int startWindow = 0;

        for(int endWindow = 0; endWindow < s.length(); endWindow++){
            char currentChar = s.charAt(endWindow);
            if(vowelSet.contains(currentChar)){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            if(endWindow >= k-1){
                if(vowelSet.contains(s.charAt(startWindow++))){
                    count--;
                }
            }
        }

		System.out.println("Total count = " + maxCount);
	}
}
	

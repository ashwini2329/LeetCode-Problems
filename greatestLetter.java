import java.util.HashSet;

/**
 
Given a string of English letters s, return the greatest English letter which occurs as both a 
lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter 
exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

 

Example 1:

Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:

Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
Example 3:

Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase and uppercase English letters.
 */


/******************************************************************
       2309. Greatest English Letter in Upper and Lower Case
******************************************************************/

public class greatestLetter {
    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        
        int strLength = s.length();
        HashSet<Character> lowerCase = new HashSet<>();
        HashSet<Character> upperCase = new HashSet<>();

        for(int i=0; i<strLength; i++) {
            if(Character.isLowerCase(s.charAt(i))) {
                lowerCase.add(s.charAt(i));
            }
                
            if(Character.isUpperCase(s.charAt(i))) {
                upperCase.add(s.charAt(i));
            }
        }

        String result = "";
        int number = -1;
        for(Character c: lowerCase) {
            if(upperCase.contains(Character.toUpperCase(c))) {
                int num = (int) c;
                if(num > number) {
                    number = num;
                    result = Character.toString(Character.toUpperCase(c));
                }
            }
        }

        System.out.println("result  = " + result);  // return result;
    }
}

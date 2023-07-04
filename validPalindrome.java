/**

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric 
characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */


/************************************************
            125. Valid Palindrome
************************************************/

public class validPalindrome {
    /**
     * The function checks if a given string is a palindrome.
     */
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";    // Sample Input
        
        String trimString = trimmedString(s);
        StringBuilder stringBuilder = new StringBuilder(trimString);
        if(trimString.equals(stringBuilder.reverse().toString())) {
            System.out.println("result = " + true);     // return true;
        } else {
            System.out.println("result = " + false);    // return false;
        }
    }

    /**
     * @param string The input string that needs to be trimmed and returned.
     * @return The method is returning a trimmed string that contains only lowercase letters and digits
     * from the input string.
     */
    public static String trimmedString(String string) {
        int strLength = string.length();
        String resultStr = "";

        for(int i=0; i<strLength; i++) {
            if(Character.isLetter(string.charAt(i)) || Character.isDigit(string.charAt(i))) {
                resultStr += Character.toLowerCase(string.charAt(i));
            }
        }

        return resultStr;
    }
}

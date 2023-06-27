/**

The value of an alphanumeric string can be defined as:

The numeric representation of the string in base 10, if it comprises of digits only.
The length of the string, otherwise.
Given an array strs of alphanumeric strings, return the maximum value of any string in strs.

 

Example 1:

Input: strs = ["alic3","bob","3","4","00000"]
Output: 5
Explanation: 
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".
Example 2:

Input: strs = ["1","01","001","0001"]
Output: 1
Explanation: 
Each string in the array has value 1. Hence, we return 1.
 

Constraints:

1 <= strs.length <= 100
1 <= strs[i].length <= 9
strs[i] consists of only lowercase English letters and digits.
 */

/**************************************************************************
                2496. Maximum Value of a String in an Array
**************************************************************************/

public class maxStringValue {
    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3","4","00000"};    // Sample Input
        
        int arrLength = strs.length;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<arrLength; i++) {
            int length;
            if(isAlphanumeric(strs[i])) {
                length = strs[i].length();
            } else {
                length = Integer.parseInt(strs[i]);
            }
            if(length > result) {
                result = length;
            }
        }

        System.out.println("result = " + result);   // return result
    }

    
    /**
     * The function checks if a given string contains both letters and digits, or just letters.
     * 
     * @param str a String that is being checked for alphanumeric characters.
     * @return The method is returning a boolean value, either true or false.
     */
    public static boolean isAlphanumeric(String str) {
        int strLength = str.length();
        boolean hasDigit = false;
        boolean hasLetter = false;

        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                hasLetter = true;
            }
            if(Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if(hasDigit && hasLetter) {
            return true;
        } else if(hasLetter) {
            return true;
        } else {
            return false;
        }
    }
}

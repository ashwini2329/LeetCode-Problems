import java.util.ArrayList;

/**
 ******************************************************************
                         344. Reverse String
 ******************************************************************

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int arrLength = s.length;
        ArrayList<Character> arrList = new ArrayList<>();

        for(int i=arrLength-1; i>=0; i--) {
            arrList.add(s[i]);
        }

        System.out.println("arrlist = " + arrList);

        for(int i=0; i<arrLength; i++) {
            s[i] = arrList.get(i);
        }

        // NOTE :- We don't have to return anything, we just need to modify the same array
        for(int i=0; i<arrLength; i++) {
            System.out.println(s[i]);
        }
    }
}

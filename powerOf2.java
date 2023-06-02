/**
 ************************************************************************
                            231. Power of Two
 ************************************************************************

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 */

public class powerOf2 {
    public static void main(String[] args) {
        int n = 8;
        boolean result = false;
        if (n <= 0) {
            result =  false;
        }
        
        // A number n is a power of two if and only if it has only one bit set.
        // Using the bitwise AND operation, we can check if n has only one bit set.
        result = (n & (n - 1)) == 0;

        System.out.println("result = " + result);   // return result;
    }
}

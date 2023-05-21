/**
 *************************************************************************
                 2119. A Number After a Double Reversal
 *************************************************************************

Reversing an integer means to reverse all its digits.

For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true 
if reversed2 equals num. Otherwise return false.

 

Example 1:

Input: num = 526
Output: true
Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
Example 2:

Input: num = 1800
Output: false
Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
Example 3:

Input: num = 0
Output: true
Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
 

Constraints:

0 <= num <= 106
 */



 /**
  *****************************************
                SOLUTION
  *****************************************
  */

class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0;
        int temp = num;
        while(temp != 0) {
            int rem = temp % 10;
            rev = rev*10 + rem;
            temp/=10;
        }

        int anotherTemp = rev;
        int anotherRev = 0;
        while(anotherTemp != 0) {
            int rem = anotherTemp % 10;
            anotherRev = anotherRev*10 + rem;
            anotherTemp/=10;
        }

        boolean result = (num == anotherRev) ? true : false;
        return result;
    }
}
/**

Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number 
of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */


/****************************************************
            485. Max Consecutive Ones
****************************************************/

public class consecutivOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        int numsLength = nums.length;
        int result = 0;

        int count = 0;
        for(int i=0; i<numsLength; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                if(count > result) {
                    result = count;
                }
                count = 0;
            }
        }

        if(count > result) {
            result = count;
        }
        System.out.println("result = " + result);   // return result;
    }
}

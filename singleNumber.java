import java.util.ArrayList;

/**
 **********************************************************************
                         136. Single Number
 **********************************************************************

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int numsLength = nums.length;
        int result = -1;

        ArrayList<Integer> oneTime = new ArrayList<Integer>();
        ArrayList<Integer> twoTime = new ArrayList<Integer>();

        for(int i=0; i<numsLength; i++) {
            if(oneTime.contains(nums[i])) {
                twoTime.add(nums[i]);
            } else {
                oneTime.add(nums[i]);
            }
        }

        for(int i=0; i<oneTime.size(); i++) {
            if(!twoTime.contains(oneTime.get(i))) {
                result = oneTime.get(i);
            }
        }

        System.out.println(result);     // return result;
    }
}

import java.util.ArrayList;

/**
 * 448. Find All Numbers Disappeared in an Array
Easy
8.7K
442
Companies
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? 
You may assume the returned list does not count as extra space.
 */

public class problem448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> numsList = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            numsList.add(nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=nums.length; i++) {
            if(!numsList.contains(i)) {
                result.add(i);
            }
        }

        System.out.println("result = " + result);

    }
}

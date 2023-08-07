import java.util.ArrayList;

/**
 
You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. 
If there are no target indices, return an empty list. The returned list must be sorted in 
increasing order.

 

Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i], target <= 100
 */


/****************************************************************
         2089. Find Target Indices After Sorting Array
****************************************************************/

public class problem2089 {
    public static void main(String[] args) {
        // Sample Input
        int[] nums = {1,2,5,2,3};
        int target = 2;

        for(int i=0; i<nums.length-1; i++) {
            for(int j=0; j<nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] =  nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                result.add(i);
            }
        }

        System.out.println("result  = " + result);  // return result;
    }
}

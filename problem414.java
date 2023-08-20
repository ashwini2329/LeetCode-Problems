/**
 * 414. Third Maximum Number
Easy
2.7K
2.9K
Companies
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Can you find an O(n) solution?
 */

public class problem414 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1}; // Sample Input

        // using bubble sort
        for(int i=0; i<nums.length-1; i++) {
            for(int j=0; j<nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int largest;
        int secondLargest;
        int thirdLargest;
        if(nums.length >= 3) {
            largest = nums[nums.length-1];
            secondLargest = nums[nums.length-1];
            thirdLargest = nums[nums.length-1];
        } else {
            largest = nums[nums.length-1];
            secondLargest = nums[nums.length-1];
            thirdLargest = nums[nums.length-1];
        }

        if(nums.length >= 3) {
            for(int i=nums.length-2; i>=0; i--) {
                if(nums[i] < largest) {
                    secondLargest = nums[i];
                    break;
                }
            }
        }
       
        if(nums.length >= 3) {
            for(int i=nums.length-2; i>=0; i--) {
                if(nums[i] < secondLargest) {
                    thirdLargest = nums[i];
                    break;
                }
            }
        }
      
        System.out.println("thirdLargest = " + thirdLargest);   // return thirdLargest;
    }
}

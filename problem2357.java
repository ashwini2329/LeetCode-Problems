/**

You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.

 

Example 1:

Input: nums = [1,5,0,3,5]
Output: 3
Explanation:
In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
Example 2:

Input: nums = [0]
Output: 0
Explanation: Each element in nums is already 0 so no operations are needed.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
 */


/********************************************************************
        2357. Make Array Zero by Subtracting Equal Amounts
********************************************************************/

public class problem2357 {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};   // Sample Input
        int noOfOperations = 0;

        if(!isRequied(nums)) {
            System.out.println("noOfOperations = " + 0);    // return 0;
        } else {
            while(isRequied(nums)) {
                int smallest = Integer.MAX_VALUE;
                for(int i=0; i<nums.length; i++) {
                    if(nums[i] < smallest && nums[i] !=0) {
                        smallest = nums[i];
                    }
                }
                for(int i=0; i<nums.length; i++){
                    if(nums[i] !=0) {
                        nums[i] = nums[i] - smallest;
                    }
                }
                noOfOperations++;
                if(!isRequied(nums)) {
                    break;
                }
            }
            System.out.println("Total Operations = " + noOfOperations);    // return noOfOperations;
        }
    }

    public static boolean isRequied(int[] arr) {
        boolean isRequired = false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                isRequired = true;
                break;
            }
        }
        return isRequired;
    }
}

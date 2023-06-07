import java.util.ArrayList;

/**
 ******************************************************
             1748. Sum of Unique Elements
 ******************************************************

You are given an integer array nums. The unique elements of an array are the elements that 
appear exactly once in the array.

Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

public class sumOfUnique {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,1,5,4,6,5};     // for example
        int numsLength = nums.length;
        int totalSum = 0;

        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        ArrayList<Integer> visited = new ArrayList<Integer>();

        for(int i=0; i<numsLength; i++) {
            if(visited.contains(nums[i])) {
                continue;
            } else {
                int current = nums[i];
                int count = 0;
                for(int j=0; j<numsLength; j++) {
                    if(current == nums[j]) {
                        count++;
                    }
                }
                visited.add(current);
                if(count == 1) {
                    uniqueElements.add(current);
                }
            }
        }

        int sum = 0;
        if(uniqueElements.size() == 1) {
            totalSum = uniqueElements.get(0);
        } else {
            for(int i=0; i<uniqueElements.size(); i++) {
                sum+=uniqueElements.get(i);
            }
            totalSum = sum;
        }
        System.out.println("totals sum = " + totalSum);     // return totalSum;
    }
}

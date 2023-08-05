import java.util.ArrayList;

/**
 
Given an integer array nums, move all the even integers at the beginning of the array followed by 
all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */


/*************************************************
            905. Sort Array By Parity
*************************************************/

public class lecture905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int e: even) {
            result.add(e);
        }

        for(int o: odd) {
            result.add(o);
        }

        int[] resultArr = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        
        for(int re: resultArr) {
            System.out.println("re = " + re);
        }
    }
}

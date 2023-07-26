import java.util.ArrayList;
import java.util.HashSet;

/**
 
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */


/**************************************************
         349. Intersection of Two Arrays
**************************************************/

public class intersectionArrrays {
    public static void main(String[] args) {
        // Sample Input
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        ArrayList<Integer> nums1List = new ArrayList<>();
        ArrayList<Integer> nums2List = new ArrayList<>();

        for(int i=0; i<nums1.length; i++) {
            nums1List.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++) {
            nums2List.add(nums2[i]);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int i=0; i<nums1List.size(); i++) {
            if(nums2List.contains(nums1List.get(i))) {
                result.add(nums1List.get(i));
            }
        }

        for(int i=0; i<nums2List.size(); i++) {
            if(nums1List.contains(nums2List.get(i))) {
                result.add(nums2List.get(i));
            }
        }

        ArrayList<Integer> resultSet = new ArrayList<>();
        for(Integer res: result) {
            resultSet.add(res);
        }

        int[] resultArr = new int[resultSet.size()];
        for(int i=0; i<result.size(); i++) {
            resultArr[i] = resultSet.get(i);
        }
    }
}

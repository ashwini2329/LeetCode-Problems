import java.util.ArrayList;
import java.util.HashSet;

/**

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all
 the values that are present in at least two out of the three arrays. You may return the values in 
 any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 

Constraints:

1 <= nums1.length, nums2.length, nums3.length <= 100
1 <= nums1[i], nums2[j], nums3[k] <= 100
 */


/*****************************************************
            2032. Two Out of Three
*****************************************************/

public class twoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int nums3Length = nums3.length;

        ArrayList<Integer> list1 = new ArrayList<>(); 
        ArrayList<Integer> list2 = new ArrayList<>(); 
        ArrayList<Integer> list3 = new ArrayList<>(); 

        HashSet<Integer> visited = new HashSet<>();

        for(int i=0; i<nums1Length; i++) {
            list1.add(nums1[i]);
        }

        for(int i=0; i<nums2Length; i++) {
            list2.add(nums2[i]);
        }

        for(int i=0; i<nums3Length; i++) {
            list3.add(nums3[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<nums1Length; i++) {
            if(!visited.contains(nums1[i])) {
                if(list2.contains(nums1[i]) || list3.contains(nums1[i])) {
                    result.add(nums1[i]);
                }
            }
            visited.add(nums1[i]);
        }

        for(int i=0; i<nums2Length; i++) {
            if(!visited.contains(nums2[i])) {
                if(list1.contains(nums2[i]) || list3.contains(nums2[i])) {
                    result.add(nums2[i]);
                }
            }
            visited.add(nums2[i]);
        }

        for(int i=0; i<nums3Length; i++) {
            if(!visited.contains(nums3[i])) {
                if(list1.contains(nums3[i]) || list2.contains(nums3[i])) {
                    result.add(nums3[i]);
                }
            }
            visited.add(nums3[i]);
        }

        System.out.println("result = " + result);   // return result;
    }
}

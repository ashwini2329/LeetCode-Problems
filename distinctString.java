import java.util.ArrayList;

/**

A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

 

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. 
Example 2:

Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.
Example 3:

Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
 

Constraints:

1 <= k <= arr.length <= 1000
1 <= arr[i].length <= 5
arr[i] consists of lowercase English letters.
 */


/*************************************************************************************
                        2053. Kth Distinct String in an Array
*************************************************************************************/
public class distinctString {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        int arrLength = arr.length;
        ArrayList<String> distinct = new ArrayList<>();
        ArrayList<String> visited = new ArrayList<>();

        for(int i=0; i<arrLength; i++) {
            int count = 0;
            if(!visited.contains(arr[i])) {
                for(int j=0; j<arrLength; j++) {
                    if(arr[i].equals(arr[j])) {
                        count++;
                    }
                }
                visited.add(arr[i]);
                if(count == 1) {
                    distinct.add(arr[i]);
                }
            }
        }

        if(distinct.size() < k) {
            System.out.println("empty string");     // return "";
        } else {
            System.out.println("result = " + distinct.get(k-1));;     // return distinct.get(k-1);
        }
    }
}

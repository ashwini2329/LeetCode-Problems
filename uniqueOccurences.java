import java.util.HashMap;
import java.util.HashSet;

/**

Given an array of integers arr, return true if the number of occurrences of each value in the array
is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
 */


/*************************************************
        1207. Unique Number of Occurrences
*************************************************/

public class uniqueOccurences {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};  // Sample Input

        int arrLength = arr.length;
        HashSet<Integer> visited = new HashSet<>();
        HashMap<String, Integer> countMap = new HashMap<>();

        for(int i=0; i<arrLength; i++) {
            if(!visited.contains(arr[i])) {
                int count = 0;
                for(int j=0; j<arrLength; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                    }
                }
                countMap.put(String.valueOf(arr[i]), count);
            }
            visited.add(arr[i]);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(Integer value: countMap.values()) {
            resultSet.add(value);
        }

        if(countMap.size() == resultSet.size()) {
            System.out.println(" result = " + true);    // return true;
        } else {
            System.out.println("result = " + false);    // return false;
        }
    }
}

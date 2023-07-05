import java.util.ArrayList;

/**

Given an array of integers arr, a lucky integer is an integer that has a frequency in the 
array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 

Constraints:

1 <= arr.length <= 500
1 <= arr[i] <= 500
 */
/*******************************************************
        1394. Find Lucky Integer in an Array
*******************************************************/

public class luckyNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};

        int arrLength = arr.length;
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();

        for(int i=0; i<arrLength; i++) {
            int count = 0;
            for(int j=0; j<arrLength; j++) {
                if(!visited.contains(arr[i])) {
                    if(arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            visited.add(arr[i]);
            if(count == arr[i]) {
                luckyNumbers.add(arr[i]);
            }
        }

        if(luckyNumbers.size() > 0) {
            int largestLuckyNumber = luckyNumbers.get(0);
            for(int i=0; i<luckyNumbers.size(); i++) {
                if(luckyNumbers.get(i) > largestLuckyNumber) {
                    largestLuckyNumber = luckyNumbers.get(i);
                }
            }
            System.out.println("largest lucky number = " + largestLuckyNumber); // return largestLuckyNumber;
        } else {
            System.out.println("-1");   // return -1;
        }
    }
}

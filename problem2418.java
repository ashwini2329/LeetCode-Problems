import java.util.HashMap;

/**
 
You are given an array of strings names, and an array heights that consists of distinct positive 
integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 

Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */


/***************************************
         2418. Sort the People
***************************************/

public class problem2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heigths = {180,165,170};

        HashMap<Integer, String> people = new HashMap<>();

        for(int i=0; i<names.length; i++) {
            people.put(heigths[i], names[i]);
        }

        // using bubble Sort
        for(int i=0; i<heigths.length-1; i++) {
            int largest = i;
            for(int j=i+1; j<heigths.length; j++) {
                if(heigths[largest] < heigths[j]) {
                    largest = j;
                }
            }

            int temp = heigths[largest];
            heigths[largest] = heigths[i];
            heigths[i] = temp;
        }

        String[] result = new String[names.length];
        for(int i=0; i<names.length; i++) {
            result[i] = people.get(heigths[i]);
        }

        for(String s: result) {
            System.out.print(s + " ");
        }
        // return result;
    }
}

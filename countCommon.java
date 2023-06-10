import java.util.ArrayList;

/**
 *************************************************************************
             2085. Count Common Words With One Occurrence
 *************************************************************************
Easy
655
14
Companies
Given two string arrays words1 and words2, return the number of strings that appear exactly 
once in each of the two arrays.

 

Example 1:

Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
Output: 2
Explanation:
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. 
We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.
Example 2:

Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
Output: 0
Explanation: There are no strings that appear in each of the two arrays.
Example 3:

Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
Output: 1
Explanation: The only string that appears exactly once in each of the two arrays is "ab".
 

Constraints:

1 <= words1.length, words2.length <= 1000
1 <= words1[i].length, words2[j].length <= 30
words1[i] and words2[j] consists only of lowercase English letters.
 */

public class countCommon {
    public static void main(String[] args) {
        // Sample Input
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};

        int result = 0;

        // ArrayList to set unique elements of the array
        ArrayList<String> uniqueWords1 = new ArrayList<>();
        ArrayList<String> uniqueWords2 = new ArrayList<>();

        // ArrayList to check String is visited
        ArrayList<String> visited1 = new ArrayList<>();
        ArrayList<String> visited2 = new ArrayList<>();

        // loop to find unique elements in the array words1
        for(int i=0; i<words1.length; i++) {
            if(uniqueWords1.contains(words1[i])) {
                uniqueWords1.remove(words1[i]);
            } else {
                if(!visited1.contains(words1[i])) {
                    uniqueWords1.add(words1[i]);
                }
                visited1.add(words1[i]);
            }
        }

        // loop to find unique elements in the array words2
        for(int i=0; i<words2.length; i++) {
            if(uniqueWords2.contains(words2[i])) {
                uniqueWords2.remove(words2[i]);
            } else {
                if(!visited2.contains(words2[i])) {
                    uniqueWords2.add(words2[i]);
                }
                visited2.add(words2[i]);
            }
        }

        // getting length of unique Words1 Array
        int words1Length = uniqueWords1.size();

        // loop to check common elements in the array words1 and words2
        for(int i=0; i<words1Length; i++) {
            if(uniqueWords2.contains(uniqueWords1.get(i))) {
                result++;
            }
        }

        // print or return the result
        System.out.println("result = " + result);   // return result;
    }
}

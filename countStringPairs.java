import java.util.HashSet;

/**

You are given a 0-indexed string array words.

Two strings are similar if they consist of the same characters.

For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] 
and words[j] are similar.

 

Example 1:

Input: words = ["aba","aabb","abcd","bac","aabc"]
Output: 2
Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'. 
Example 2:

Input: words = ["aabb","ab","ba"]
Output: 3
Explanation: There are 3 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
- i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.
Example 3:

Input: words = ["nba","cba","dba"]
Output: 0
Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consist of only lowercase English letters.
 */


/*********************************************************
         2506. Count Pairs Of Similar Strings
*********************************************************/

public class countStringPairs {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};    // Sample Input

        int wordsLength = words.length;
        int pairCount = 0;

        for(int i=0; i<wordsLength-1; i++) {
            int strLength = words[i].length();

            HashSet<Character> ith = new HashSet<>();
            for(int j=0; j<strLength; j++) {
                ith.add(words[i].charAt(j));
            }

            for(int j=i+1; j<wordsLength; j++) {
                int strLen = words[j].length();

                HashSet<Character> jth = new HashSet<>();
                for(int k=0; k<strLen; k++) {
                    jth.add(words[j].charAt(k));
                }

                if(ith.size() == jth.size()) {
                    boolean isSame = true;
                    for(char c: jth) {
                        if(!ith.contains(c)) {
                            isSame = false;
                            break;
                        }
                    }

                    if(isSame) {
                        pairCount++;
                    }
                }
            }
        }

        System.out.println("pair count = " + pairCount);    // return pairCount;
    }
}

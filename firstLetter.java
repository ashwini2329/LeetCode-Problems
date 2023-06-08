import java.util.ArrayList;

/**
 **********************************************************************
                2351. First Letter to Appear Twice
 **********************************************************************

 Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:
A letter a appears twice before another letter b if the second occurrence of a is before the 
second occurrence of b.
s will contain at least one letter that appears twice.
 

Example 1:

Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index 
of its second occurrence is the smallest.
Example 2:

Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
 

Constraints:

2 <= s.length <= 100
s consists of lowercase English letters.
s has at least one repeated letter.
 */

public class firstLetter {
    public static void main(String[] args) {
        String s = "abccbaacz";     // sample input
        int stringLength = s.length();

        ArrayList<Character> visited = new ArrayList<Character>();
        char result = ' ';
        int secondOccurence = Integer.MAX_VALUE;

        for(int i = 0; i < stringLength; i++) {
            char ch = s.charAt(i);
            if(visited.contains(ch)) {
                continue;
            } else {
                int count = 0;
                for(int j = i; j < stringLength; j++) {
                    visited.add(ch);
                    if(Character.compare(ch, s.charAt(j)) == 0) {
                        count++;
                    }
                    if(count == 2) {
                        if(j < secondOccurence) {
                            secondOccurence = j;
                            result = ch;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("result = " + result);   // return result;
    }
}

/**

You are given a string s of even length. Split this string into two halves of equal lengths, 
and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels 
('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 

Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
 */


/***********************************************************
         1704. Determine if String Halves Are Alike
***********************************************************/

public class halfStrings {
    public static void main(String[] args) {
        String s = "textbook";  // Sample Input

        int strLength = s.length();
        String a = s.substring(0, strLength/2);
        String b = s.substring((strLength/2), strLength);

        if(vowelCount(a) == vowelCount(b)) {
            System.out.println("result = " + true); // return true;
        } else {
            System.out.println("result = " + false);    // return false;
        }
    }

    public static int vowelCount(String str) {
        int stringLength = str.length();
        int count = 0;

        for(int i=0; i<stringLength; i++) {
            if((Character.compare('a', str.charAt(i)) == 0) || 
                (Character.compare('e', str.charAt(i)) == 0) ||
                (Character.compare('i', str.charAt(i)) == 0) || 
                (Character.compare('o', str.charAt(i)) == 0) ||
                (Character.compare('u', str.charAt(i)) == 0) || 
                (Character.compare('A', str.charAt(i)) == 0) ||
                (Character.compare('E', str.charAt(i)) == 0) || 
                (Character.compare('I', str.charAt(i)) == 0) ||
                (Character.compare('O', str.charAt(i)) == 0) || 
                (Character.compare('U', str.charAt(i)) == 0)) {
                count++;
            }
        }
        
        return count;
    }
}

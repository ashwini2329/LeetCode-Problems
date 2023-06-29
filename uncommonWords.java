import java.util.ArrayList;

/**
 
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the 
other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer 
in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */


/*******************************************************************************
                    884. Uncommon Words from Two Sentences
********************************************************************************/

public class uncommonWords {
    public static void main(String[] args) {
        String s1 = "s z z z s", s2 = "s z ejt";    // Sample Input

        String[] stringArray1 = s1.split(" ");
        String[] stringArray2 = s2.split(" ");

        int array1Length = stringArray1.length;
        int array2Length = stringArray2.length;

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> resultArrayList = new ArrayList<>();

        for(int i=0; i<array1Length; i++) {
            arrayList1.add(stringArray1[i]);
        }

        for(int i=0; i<array2Length; i++) {
            arrayList2.add(stringArray2[i]);
        }

        for(int i=0; i<array1Length; i++) {
            int count = 0;
            for(int j=0; j<array1Length; j++) {
                if(stringArray1[i].equals(stringArray1[j])) {
                    count++;
                }
            }
            if(count == 1 && !arrayList2.contains(stringArray1[i])) {
                resultArrayList.add(stringArray1[i]);
            }
        }

        for(int i=0; i<array2Length; i++) {
            int count = 0;
            for(int j=0; j<array2Length; j++) {
                if(stringArray2[i].equals(stringArray2[j])) {
                    count++;
                }
            }
            if(count == 1 && !arrayList1.contains(stringArray2[i])) {
                resultArrayList.add(stringArray2[i]);
            }
        }

        String[] resultArray = new String[resultArrayList.size()];
        for(int i=0; i<resultArrayList.size(); i++) {
            resultArray[i] = resultArrayList.get(i);
        }

        // return resultArray;
        for(String result: resultArray) {
            System.out.println("result = " + result);
        }
    }
}

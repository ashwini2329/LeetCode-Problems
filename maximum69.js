/**
 *******************************************************************
                        1323. Maximum 69 Number
 *******************************************************************

You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

 

Example 1:

Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.
 

Constraints:

1 <= num <= 104
num consists of only 6 and 9 digits.
 */

// let num = 9669;
// let num = 9996;
let num = 9999;
let str = num.toString();
let arr = str.split("");
let arrLen = arr.length;
let result = 0;

let count = 0;
for (i = 0; i < arrLen; i++) {
    if (arr[i] == 9) {
        count++;
    }
}

if (count == arrLen) {
    result = num;
} else {
    for (i = 0; i < arrLen; i++) {
        let sixChanged = false;

        if (arr[i] == 6) {
            arr[i] = 9;
            sixChanged = true;
        } else {
            arr[i] = 6;
        }

        let current = Number(arr.join(""));
        if (current > result) {
            result = current;
        }

        if (sixChanged) {
            arr[i] = 6;
        } else {
            arr[i] = 9;
        }
    }
}

console.log(`result = ${result}`);
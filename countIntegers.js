/**
 ********************************************************************
            2180. Count Integers With Even Digit Sum
 ********************************************************************

Given a positive integer num, return the number of positive integers less than or equal to num 
whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits.

 

Example 1:

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
Example 2:

Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
 

Constraints:

1 <= num <= 1000
 */

let num = 30;
let count = 0;

for (i = 2; i <= num; i++) {
    if (i < 10) {
        console.log(`i = ${i}`);
        if (i % 2 == 0) {
            console.log(`counted !`);
            count++;
        }
    } else {
        let len = i.toString().length;
        console.log(`len at ${i} = ${len}`);
        let sum = 0;
        for (j = 0; j < len; j++) {
            let c = i.toString().charAt(j);
            console.log(`c at ${j} = ${c}`);
            sum += parseInt(c);
        }
        console.log(`sum = ${sum}`);
        if (sum % 2 == 0) {
            count++;
        }
    }
    console.log("************************************");
}
console.log(`count = ${count}`);
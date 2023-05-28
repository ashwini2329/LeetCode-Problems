/**
 **********************************************************************************************
            2455. Average Value of Even Numbers That Are Divisible by Three
 **********************************************************************************************

Given an integer array nums of positive integers, return the average value of all even integers 
that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down 
to the nearest integer.

 

Example 1:

Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:

Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 1000
 */

// let nums = [1, 3, 6, 10, 12, 15];
// let nums = [1, 2, 4, 7, 10];
let nums = [
  94, 65, 82, 40, 79, 74, 92, 84, 37, 19, 16, 85, 20, 79, 25, 89, 55, 67, 84, 3,
  79, 38, 16, 44, 2, 54, 58, 94, 69, 71, 14, 24, 13, 21,
];

let arrLength = nums.length;
let sum = 0;
let count = 0;

for (i = 0; i < arrLength; i++) {
  if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
    console.log(nums[i]);
    sum += nums[i];
    count++;
  }
}

if (count == 0) {
  console.log(`average = ${0}`);
} else {
  console.log(`average = ${Math.floor(sum / count)}`);
}

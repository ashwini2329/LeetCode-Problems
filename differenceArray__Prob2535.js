/**
 *******************************************************
 Problem 2535:  Difference Between Element Sum and Digit Sum of an Array
 *******************************************************

 You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.

 

Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 

Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */

let nums = [
  3, 6, 15, 14, 17, 12, 9, 9, 15, 3, 13, 5, 18, 13, 18, 17, 5, 14, 7, 20,
];

let numsLength = nums.length;
let elementSum = 0;
let digitSum = 0;

for (i = 0; i < numsLength; i++) {
  elementSum += nums[i];
}

console.log(`elementSum = ${elementSum}`);

let temp = "";
for (i = 0; i < numsLength; i++) {
  temp += nums[i].toString();
}

console.log(`temp = ${temp}`);

for (i = 0; i < temp.length; i++) {
  let xyx = temp.charAt(i);
  digitSum += parseInt(xyx);
}

console.log(`digitSum = ${digitSum}`);

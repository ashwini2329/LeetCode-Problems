/**
 **************************************************************
                 169. Majority Element
 **************************************************************

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the 
majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

let nums = [2, 2, 1, 1, 1, 2, 2];
// let nums = [3, 2, 3];
// let nums = [6, 5, 5];
let arrLength = nums.length;
let maxCount = 0;
let majorityElement = 0;

for (i = 0; i < arrLength; i++) {
    let count = 0;
    for (j = i; j < arrLength; j++) {
        if (nums[j] == nums[i]) {
            count++;
        }
    }
    if (count > maxCount) {
        maxCount = count;
        majorityElement = nums[i];
    }
}

console.log(`majority element = ${majorityElement}`);
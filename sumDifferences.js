/**
 ***************************************************************************************
                    Problem 2574. Left and Right Sum Differences
 ***************************************************************************************

 Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */

let nums = [10, 4, 8, 3];
let leftSumArray = [0];
let rightSumArray = [0];
let numsLength = nums.length;

let leftSum = 0;
for (i = 0; i < numsLength - 1; i++) {
    leftSum += nums[i];
    leftSumArray.push(leftSum);
}

let reversedNums = nums.reverse();
// console.log(`reversed nums = ${reversedNums}`);

let rightSum = 0;
let tempSumArray = [0];
for (i = 0; i < numsLength - 1; i++) {
    rightSum += reversedNums[i];
    tempSumArray.push(rightSum);
}
// console.log(`temp right sum array = ${tempSumArray}`);
rightSumArray = tempSumArray.reverse();

console.log(`leftSum Array = ${leftSumArray}`);
console.log(`rightSum Array = ${rightSumArray}`);

let resultArray = [];
for (i = 0; i < numsLength; i++) {
    resultArray.push(Math.abs(leftSumArray[i] - rightSumArray[i]));
}

console.log(`result Array = ${resultArray}`);
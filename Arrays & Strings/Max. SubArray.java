//Leetcode:2 MAX. SUBARRAY PROBLEM

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar=nums[0];
        int currmax=nums[0];

        for(int i =1;i<nums.length;i++)
        {
            currmax=Math.max(nums[i],nums[i]+currmax);
            maxsofar=Math.max(maxsofar,currmax);
        }
              return maxsofar;
            }
        }
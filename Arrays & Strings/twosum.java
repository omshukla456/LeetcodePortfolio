// Leetcode : Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] arr = new int[2];
        for(i=0;i<nums.length;i++)
        {
            for(j=1+i;j<nums.length;j++)
            {
                if( nums[i]+nums[j]==target)
                {
                   arr[0]=i;
                    arr[1]=j;
                    
                }
                }
        }
        return arr;
        
    }
}
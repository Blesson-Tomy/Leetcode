//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int leng=nums.length;
        int[] res= new int[2];
        for(int i=0;i<leng;i++)
        {
            for(int j=i+1;j<leng;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        
            return res;
        
    }
}
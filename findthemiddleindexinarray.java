class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] larr = new int[nums.length];
        int[] rarr = new int[nums.length];
        int[] ans = new int[nums.length];
        ans[0]=0;
        ans[nums.length-1]=nums[nums.length-1];
        int i=0;

        for(i=1;i<nums.length;i++)
        {
            larr[i]=larr[i-1]+nums[i-1];
        }
        for(i=nums.length-2;i>=0;i--)
        {
            rarr[i]=rarr[i+1]+nums[i+1];
        }
        for(i=0;i<nums.length;i++)
        {
            ans[i]=larr[i]+rarr[i];
        }

        for(i=0;i<nums.length;i++)
        {
            if(larr[i]==rarr[i])
            {
                return i;
            }
        }
        return -1;
        
    }
}
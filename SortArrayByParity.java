class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ans[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
            {
                ans[count]=nums[i];
                count++;
            }
        }
        
     return ans;   
    }
}
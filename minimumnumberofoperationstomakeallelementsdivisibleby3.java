class Solution {
    public int minimumOperations(int[] nums) {

        int ans=0, cnt=0;
        
        for(int i=0;i<nums.length;i++)
        {
            cnt=nums[i]%3;
            if(cnt>1)
            {
               ans = ans + 1; 
            }
            else
            {
                ans = ans + cnt;
            }
        }

        return ans;
    }
}
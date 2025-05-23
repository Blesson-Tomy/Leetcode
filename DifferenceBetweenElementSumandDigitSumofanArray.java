class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,dsum=0,temp=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=nums[i]+sum;
            temp=nums[i];
            while(temp>0)
            {
               dsum= temp%10 + dsum;
               temp=temp/10;
            }
        }
        return Math.abs(sum-dsum);
    }
}
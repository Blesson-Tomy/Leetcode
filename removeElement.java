class Solution {
    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int count=0;
        int i=0;

        for(i=0;i<len;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]==nums[i])
                {
                    nums[j]=10000;
                    count++;

                }
            }
        }

        for(i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(nums[j]<nums[i])
                {
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
                
            }}   
            return len-count;
    }
}
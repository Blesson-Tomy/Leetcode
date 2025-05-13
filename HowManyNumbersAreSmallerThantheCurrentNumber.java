class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] res = new int[nums.length];
        int check=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            check=nums[i];
            count=0;
            for(int j=0;j<nums.length;j++)
            {   
                if(nums[j]!=check && nums[j]<check)
                {
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int[] sleft = new int[nums.length];
        int[] sright = new int[nums.length];

        sleft[0]=nums[0];
        sright[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++)
        {
            sleft[i]=sleft[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            sright[i]=sright[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(sright[i]==sleft[i])
        {
            return i;
        }
        }
        return -1;
        
    }
}
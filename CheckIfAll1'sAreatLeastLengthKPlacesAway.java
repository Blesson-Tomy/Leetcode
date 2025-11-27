class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean nf=false;
        int prev=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {   
                
                if(nf==true && (i-prev)<k+1)
                {
                    return false;
                }
                if(nf==false)
                {
                    nf=true;
                }
                prev=i;
            }
        }
        return true;
        
    }
}
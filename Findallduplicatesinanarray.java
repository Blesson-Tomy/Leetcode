class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> hash = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int in = Math.abs(nums[i])-1;
            if(nums[in]>0)
            {
                nums[in]=-nums[in];
            }
            else
            {
                hash.add(in+1);
                
            }
        }
        return hash;
    }
}
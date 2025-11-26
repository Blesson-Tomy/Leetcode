class Solution {
    public int findFinalValue(int[] nums, int original) {
        int search = original;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==search)
            {
                search=search*2;
            }
        }
        return search;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                ele++;
            }
            else
            {
                return ele;
            }
        }
        return ele;
    }
}

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];
            i++;
        }
        return arr;
    }
}
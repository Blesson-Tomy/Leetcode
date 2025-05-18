class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] avg=new double[nums.length/2];
        int k=0;
        for(int i=0;i<nums.length/2;i++)
        { 

        avg[k]= (nums[i]+nums[nums.length-1-i])/2.0;
        k++;
        }
    Arrays.sort(avg);
    return avg[0];
    }
}
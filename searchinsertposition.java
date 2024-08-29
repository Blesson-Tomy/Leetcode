//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

class Solution {
    int s=0;
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==target)
            {   
                
                s=i;
                break;
            }
            else 
            {   
            
                if(nums[i]>target)
                {   
                    s=i;
                    break;
                }
                else if(i==len-1)
                {
                    s=len;
                }
            }

        }
        return s;
    }

    
}
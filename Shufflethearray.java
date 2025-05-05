public class Solution {
    public int[] shuffle(int[] nums, int n) {
       
        int a=0;
        int b=n;
        int[] res= new int[2*n];

        for(int ind=0;ind<2*n;ind++)
        {
            if(ind%2==0)
            {
                res[ind]=nums[a];
                a++;

            }
            else
            {
                res[ind]=nums[b];
                b++;
            }
        }
    return res;

    }
} {
    
}

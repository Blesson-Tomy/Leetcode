class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        
        for(int i=0;i<image.length;i++)
        {int k=image.length-1;
            for(int j=0;j<image.length;j++)
            {   
                ans[i][j]=image[i][k];
                k--;
                if(ans[i][j]==0)
                {
                    ans[i][j]=1;
                }
                else
                {
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {   double num=Math.sqrt((i*i)+((j+1)*(j+1)));
                if(num<=n && Math.floor(num)==num)
                {
                    cnt++;
                }
            }
        }
        return cnt*2;
    }
    
}
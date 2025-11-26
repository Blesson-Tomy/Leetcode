class Solution {
    public int smallestRepunitDivByK(int k) {
        Boolean stat = false;
        int num=1;
        int ans=0;
        int cnt=1;
        if(k%2==0 || k%5==0)
            {
                return -1;
            }
        if(k==1)
        {
            return 1;
        }
        while(!stat)
        {
            if(num==0)
            {
                ans=num;
                stat=true;
            }
            else
            {
                num=(num*10+1)%k;
                cnt++;
            }
        }
        return cnt;
        
    }
}
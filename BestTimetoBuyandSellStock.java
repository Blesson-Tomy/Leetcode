class Solution {
    public int maxProfit(int[] prices) {
        
    int min=10000;
    int maxprof=0;

    for(int i=0;i<prices.length;i++)
    {
        if(prices[i]<min)
        {
            min=prices[i];
        }
        if(maxprof<(prices[i]-min))
        {
            maxprof=prices[i]-min;
        }
    }
    return maxprof;
    }
}


/* 
This is my first solution that raises an error due to a long time taken.
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i;j<prices.length-i;j++)
            {
                if(max<prices[j]-prices[i])
                {
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }
}
*/
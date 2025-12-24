class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1, temp=n;
        while(temp>0)
        {
            int dig=temp%10;
            sum=sum+dig;
            prod=prod*dig;
            temp=temp/10;
        }
        return prod-sum;
        
    }
}
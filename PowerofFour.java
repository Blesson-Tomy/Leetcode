// Used basic mathematical logic to solve the problem
class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n<1)
            return false;

        while(n%4==0)
        {
            n=n/4;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}



/* Initial Logic did not work due to type casting issues
int i=0;
        int ans= 0;
        Boolean an = false;

        do{
            
            ans = (int)Math.pow(4, i);
            i++;
            if(ans==n)
                an = true;

        }while(ans<=n);
        return an;
*/
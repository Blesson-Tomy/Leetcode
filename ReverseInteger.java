//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

class Solution {
    public int reverse(int x) {
        int num=x;
        int rev =0;
        int temp=0;
        int flag=0;
        
        if(num<0)
        {
            flag=1;
            num=Math.abs(num);
           
        }
        while(num!=0)
        {   
            temp=num%10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE /10 && temp > 7)) 
            {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE /10 && temp < -8)) 
            {
                return 0;
            }

            rev=rev*10 + temp;
            num=num/10;

        }
        if(flag==1)
        {
            rev = rev*-1;
        }

        return rev;
    }
}
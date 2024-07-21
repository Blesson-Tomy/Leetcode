//Question: Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

//Leetcode Submission:
class Solution {
    public boolean isPalindrome(int x) {
       
        int temp=x;
        int neww=0;

    if(x<0)
    {   
       return false;
    }

    while(temp!=0)
    {   int rem=0;
        rem=temp%10;
        neww=neww*10+rem;
        temp=temp/10;
    }
       return neww==x;
    }
    
}


/*Local Testing Program

public class palindrome {
    public static void main(String[] args) {
        int x=-121;
        int temp=x;
        int neww=0;

    while(temp!=0)
    {   int rem=0;
        rem=temp%10;
        neww=neww*10+rem;
        temp=temp/10;
    }

    if(neww==x && x>=0)
    {   
        return true;
    }
    else
    {
       return false;
    }
       
    }
    
}
    */
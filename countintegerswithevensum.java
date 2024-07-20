//Question: Count integers with even digit sum.

//Submission on leetcode:

// Testing my logic on local machine.
public class countintegerswithevensum {
    
    public static void main(String args[]) {
        int count=0;
        int n = 30;
        int sum=0;

        for(int i=1;i<=n;i++)
        {   int temp=i;
            sum=0;
            int rem=0;
            
            while(temp!=0)
            {   
                rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
            }
            if(sum%2==0 && sum!=0)
            {   
                count++;
            }
        }
        
        System.out.println(count);
    }
}
public class countintegerswithevensum {
    public static void main(String args[]) {
        int n = 30;
        int sum=0;
        int count=0;

        for(int i=1;i<=n;i++)
        {   int temp=i;
            sum=0;
            int rem=0;
            while(temp!=0)
            {   
                rem=i%10;
                sum=sum+rem;
                temp=temp/10;
            }

            if(sum%2==0)
            {   
                count++;
                System.out.print(i+" ");
                //System.out.print(sum);
            }
        }
        //System.out.print(count);
        
    }
}
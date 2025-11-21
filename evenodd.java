import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean hasEven=false;
        boolean hasOdd=false;
        int ans=0;
        if(num>9)
        {
            ans=ans+9;
            for(int i=10;i<num;i++)
            {   int temp=i;
                while(temp!=0)
                {
                    int di=temp%10;
                    if(di%2==0)
                    {
                        hasEven=true;
                    }
                    else
                    {
                        hasOdd=true;
                    }
                    temp=temp/10;
                }
                if(hasEven==true && hasOdd==false || hasEven==false && hasOdd==true)
                {
                    ans++;
                }
            }
            System.out.println(ans);
            

        
        }
        else{
            ans=num;
            System.out.println(ans);
        }

        








    }
}

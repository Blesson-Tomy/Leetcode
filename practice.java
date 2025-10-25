
import java.util.Scanner;

 public class practice {
    public static void main(String[] args)
    {
        System.out.println("Enter the String:");
        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();

        String[] arr = ans.trim().split("\\s+");

        int count=0;

        for(String word:arr)
        {
            if(word.endsWith("!") || word.endsWith(".") || word.endsWith("?"))
            {
                count++;
            }
        }
        System.out.println(count);

    }
//     public static void main(String[] args) {

//         System.out.println("Enter the String:");
//         Scanner scan = new Scanner(System.in);
//         String ans = scan.nextLine();
        
//         int count = 0;

//         Character s1 = '!';
//         Character s2 = '.';
//         Character s3 = '?';

//         for(int i=0;i<ans.length();i++)
//         {
//             char now = ans.charAt(i);
//             System.out.println(now);
//             if(now == s1)
//             {
//                 if(ans.charAt(i-1)!=s2)
//                 {
//                     if(i==ans.length()-1)
//                     {
//                         count++;
//                     }
//                     else if ( i<ans.length()-1 && ans.charAt(i+1)!=s2)
//                     {
//                         count++;
//                     }
//                 }
//             }
//             else if(now == s2)
//             {
//                 if(ans.charAt(i-1)!=s2)
//                 {
//                     if(i==ans.length()-1)
//                     {
//                         count++;
//                     }
//                     else if ( i<ans.length()-1 && ans.charAt(i+1)!=s2)
//                     {
//                         count++;
//                     }
//                 }
//             }

//             else if(now == s3)
//             {
//                 if(ans.charAt(i-1)!=s2)
//                 {
//                     if(i==ans.length()-1)
//                     {
//                         count++;
//                     }
//                     else if ( i<ans.length()-1 && ans.charAt(i+1)!=s2)
//                     {
//                         count++;
//                     }
//                 }
//             }
//             // || now == s2 || now == s3
//         }

//         System.out.println("The number of Sentences is: "+count);
        
//     }
}
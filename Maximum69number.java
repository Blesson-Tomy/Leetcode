class Solution {
    public int maximum69Number (int num) {
        
        String numStr = String.valueOf(num);

        int[] arr = new int[numStr.length()];
        boolean flag=false;
        int ans=0;

        for(int i=0;i<numStr.length();i++)
        {   
            if(numStr.charAt(i)!='9' && flag==false)
            {
                arr[i]=9;
                flag=true;
            }
            else
            {
                arr[i]=numStr.charAt(i) - '0';
            }
            
        }

        for(int i=0;i<numStr.length();i++)
        {
            ans=ans*10 + arr[i];
        }
        return ans;
    }  
}
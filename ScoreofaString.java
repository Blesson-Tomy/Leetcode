class Solution {
    public int scoreOfString(String s) {

        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if((i+1)!=s.length())
            {
                ans=ans+(Math.abs((int)s.charAt(i)-(int)(s.charAt(i+1))));
            }
        }
        return ans;
        
    }
}
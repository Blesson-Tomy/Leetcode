class Solution {
    public int minOperations(String s) {
        int min=0,count=0;
        for(int i=0;i<s.length();i++)
        {   char c= s.charAt(i);
            if(c!='a')
            {
                count=26-(((int)c-(int)'a')%26);
            }
            if(count>min)
            {
                min=count;
            }
        }
        return min;
        
    }
}
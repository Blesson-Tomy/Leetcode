class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
        char ch = s.charAt(i);
        
        if(ch=='I' && (i+1)<s.length())
        {  
            if(s.charAt(i+1)=='V')
            {
                res=res+4;
                i=i+1;
            }
            else if(s.charAt(i+1)=='X')
            {
                res=res+9;
                i=i+1;
            }
            else
        {
            res=res+1;
        }
            
        }else if(ch=='I')
        {
            res=res+1;
        }
        
        else if(ch=='V')
        {
            res=res+5;
        }
        else if(ch=='X' && i+1<s.length())
        {  
            if(s.charAt(i+1)=='L')
            {
                res=res+40;
                i=i+1;
            }
            else if(s.charAt(i+1)=='C')
            {
                res=res+90;
                i=i+1;
            }
            else
            {
            res=res+10;
            }
        }
        else if(ch=='X')
        {
            res=res+10;
        }
        else if(ch=='L')
        {
            res=res+50;
        }
        else if(ch=='C' && i+1<s.length())
        {  
            if(s.charAt(i+1)=='D')
            {
                res=res+400;
                i=i+1;
            }
            else if(s.charAt(i+1)=='M')
            {
                res=res+900;
                i=i+1;
            }
            else
            {
            res=res+100;
            }
        }
        else if(ch=='C')
        {
            res=res+100;
        }
        else if(ch=='D')
        {
            res=res+500;
        }
        else if(ch=='M')
        {
            res=res+1000;
        }

        }

        return res;
    }
    
}
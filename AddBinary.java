class Solution { 
    public String addBinary(String a, String b) 
    { String ans=""; 
        char ii='0', jj='0', res='0', carr='0'; 
        for(int i=a.length()-1,j=b.length()-1; i>=0 || j>=0; i--, j--) 
        { ii='0'; jj='0'; res='0'; 
            if(i>=0) 
            { 
                ii=a.charAt(i); 
            } 
            if(j>=0) 
            { 
                jj=b.charAt(j); 
            } 
            if(ii=='0' && jj=='0') 
            { 
                if(carr=='1') 
                { 
                    res='1'; carr='0'; 
                } 
                else 
                { 
                    res='0'; carr='0'; 
                } 
            } 
            else if(ii=='1' && jj=='0') 
            { 
                if(carr=='1') 
                { 
                   res='0'; carr='1'; 
                } 
                else 
                { 
                   res='1'; carr='0'; 
                } 
            } 
            else if(ii=='0' && jj=='1') 
            { 
                if(carr=='1') 
                { 
                    res='0'; carr='1'; 
                } 
                else 
                { 
                    res='1'; carr='0'; 
                } 
            } 
            else if(ii=='1' && jj=='1') 
            { if(carr=='1') 
                { 
                    res='1'; carr='1'; 
                } 
                else 
                { 
                    res='0'; carr='1'; 
                } 
            } 
            ans=ans+res; 
    
        } 
        if(carr=='1') 
        { 
            ans=ans+'1'; 
        } 
        StringBuilder sb = new StringBuilder(ans); 
        String reversedString = sb.reverse().toString(); 
        return reversedString; 
    } 
}
class Solution {
    public boolean isValid(String s) {
        
        char[] stack = new char[s.length()];
        int top =-1;
        
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp=='(' || temp=='[' || temp=='{' )
            {
                top++;
                stack[top]=temp;
            }
            else if(temp==')' && top>=0 && stack[top]=='(' )
            {
                top--;
            }
            else if(temp==']' && top>=0 && stack[top]=='[')
            {
                top--;
            }
            else if(temp=='}' &&  top>=0 && stack[top]=='{' )
            {
                top--;
            }
            else
            {
                return false;
            }

        }
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
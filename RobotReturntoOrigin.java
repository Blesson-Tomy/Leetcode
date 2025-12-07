class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        int i=0;
        while(i<moves.length())
        {
            if(moves.charAt(i)=='U')
            {
                y++;
            }
            else if(moves.charAt(i)=='D')
            {
                y--;
            }
            else if(moves.charAt(i)=='L')
            {
                x++;
            }
            else if(moves.charAt(i)=='R')
            {
                x--;
            }
            i++;

        }

        if(x==0 && y==0)
        {
            return true;
        }
        return false;
        
    }
}
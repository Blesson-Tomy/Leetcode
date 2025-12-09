class Solution {
    public int countOdds(int low, int high) {
        int range=high+low-1;
        int oddcnt=0;

        if(high%2==0 && low%2==0)
        {
            oddcnt=(high-low)/2;
        }
        else
        {
            oddcnt=(high-low)/2+1;
        }
        return oddcnt;
        
    }
}
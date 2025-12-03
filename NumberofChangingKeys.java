class Solution {
    public int countKeyChanges(String s) {
        String s1 = s.toLowerCase();
        int i=1,count=0;
        while(i<=s1.length()-1)
        {
            if(s1.charAt(i)!=s1.charAt(i-1))
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
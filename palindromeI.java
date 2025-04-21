class Solution {
    public boolean isPalindrome(String s) {
        String ans=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String res="";
        for(int i=ans.length()-1;i>=0;i--)
        {
            char ch=ans.charAt(i);
            res=res+ch;
        }

        return ans.equals(res);
}
}
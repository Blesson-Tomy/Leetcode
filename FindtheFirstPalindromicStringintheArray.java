class Solution {
    public String firstPalindrome(String[] words) {
        String reversed = "";
        for(int i=0;i<words.length;i++)
        {
            reversed = new StringBuilder(words[i]).reverse().toString();
            if(reversed.equalsIgnoreCase(words[i]))
            {
                return reversed;
            }
        }
        return "";
    }
}
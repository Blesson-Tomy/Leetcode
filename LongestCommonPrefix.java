class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str="";
        int i=0;
        if (strs==null || strs.length==0)
        {
            return "";
        }
        int first=strs[0].length();
        int last=strs[strs.length-1].length();
        while(i<first && i<last && strs[0].charAt(i)==strs[strs.length-1].charAt(i))
        {
            str=str+strs[0].charAt(i);
            i++;
        }
        return str;
    }
}
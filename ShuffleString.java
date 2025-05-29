class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        char[] ans = s.toCharArray();
        StringBuilder an = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            ans[indices[i]]=arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            an.append(ans[i]);
        }
        return an.toString();
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        char[] arr = t.toCharArray();
        char[] arr1 = s.toCharArray();
        char ans = 'x';

        for(int i=0;i<s.length();i++)
        {
            if(hs.get(arr1[i])==null)
            {
            hs.put(arr1[i],1);
            }
            else{
            hs.put(arr1[i],hs.get(arr1[i])+1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(!hs.containsKey(arr[i]) || hs.get(arr[i])==0)
            {
                ans=arr[i];
            }
            else
            {
                
                hs.put(arr[i],hs.get(arr[i])-1);
            }
        }
        return ans;
    }
}
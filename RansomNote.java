class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char a = magazine.charAt(i);
            if(h.containsKey(a))
            {
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }

        for(int j=0;j<ransomNote.length();j++)
        {
            char b = ransomNote.charAt(j);
            if(h.containsKey(b))
            {
                h.put(b,h.get(b)-1);
            }
            else
            {
                return false;
            }
        }

        if(h.containsValue(-1) || h.containsValue(-2) || h.containsValue(-3) )
        {
            return false;
        }
        return true;
    }
}
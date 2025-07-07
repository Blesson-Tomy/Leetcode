class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length()!=arr.length)
        {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String,Character> rmap = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++)
        {
            char key = pattern.charAt(i);
            if(map.containsKey(key))
            {
                if(!map.get(key).equals(arr[i]))
                {
                    return false;
                }

            }
            else{
                if(rmap.containsKey(arr[i]))
                {
                    return false;
                }
                 map.put(key,arr[i]);
                 rmap.put(arr[i],key);
            }
           

        }
        return true;
        
        

    }
}
class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> ht1 = new HashSet<>(Set.of('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> ht2 = new HashSet<>(Set.of('a','s','d','f','g','h','j','k','l'));
        Set<Character> ht3 = new HashSet<>(Set.of('z','x','c','v','b','n','m'));

        Set<Character> tset = null;

        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
              String word = words[i].toLowerCase();
                char st = word.charAt(0);
                
                if(ht1.contains(st))
                {
                    tset=ht1;
                }
                else if(ht2.contains(st))
                {
                    tset=ht2;
                }
                else if(ht3.contains(st))
                {
                    tset=ht3;
                }
                    
                    Boolean val = true;
                for (char c : word.toCharArray()) 
                {
                     if(!tset.contains(c)) 
                     {
                        val=false;
                        break;
                     }
                }
                if(val)
                {
                    result.add(words[i]);
                }
        
        }
        return result.toArray(new String[0]);
    }
}
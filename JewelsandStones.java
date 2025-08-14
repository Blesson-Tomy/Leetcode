class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Map<Character, Integer> ht = new HashMap<>();

        char[] arr = jewels.toCharArray();
        char[] checkk = stones.toCharArray();

        for(int i=0;i<arr.length;i++)
        {   
            if(ht.containsKey(arr[i]))
            {
                ht.put(arr[i],ht.get(arr[i])+1);
            }
            else
            {
                ht.put(arr[i],0);
            }
        }

        for(int i=0;i<checkk.length;i++)
        {
            if(ht.containsKey(checkk[i]))
            {
                count++;
            }
        }

        return count;
        

        
    }
}
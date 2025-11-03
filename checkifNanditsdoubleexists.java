class Solution {
    public boolean checkIfExist(int[] arr) {

        boolean ans = false;

        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
           
            
            

            if (h.contains(arr[i]*2) || arr[i]%2==0 && h.contains(arr[i]/2))
            {
                return true;
            }
            h.add(arr[i]);

        }

       return false; 
    }
    
}
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equalsIgnoreCase("++X") || operations[i].equalsIgnoreCase("X++") )
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}
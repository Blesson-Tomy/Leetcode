class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        String age="";
        int agen = 0;
        for(int i=0;i<details.length;i++)
        {
            
            age="" + details[i].charAt(11) + details[i].charAt(12);
            agen = Integer.parseInt(age);
            if(agen>60)
            {
                count++;
            }
        }
        return count;
    }
}
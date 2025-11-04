class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] arr = sentence.split(" ");
        char firt = ' ';
        for(int i=0;i<arr.length;i++)
        {
            char last = arr[i].charAt(arr[i].length()-1);
            if(i>=0 && i==arr.length-1)
            {
                firt = arr[0].charAt(0);
            }
            else{
                firt = arr[i+1].charAt(0);
            }
            if(last!=firt)
            {
                return false;
            }
        }
        return true;

    }
}
class Solution {
    public boolean isValid(String word) {

        boolean check=false, patcheck=false, vow=false, con=false;


        if(word.length()>=3)
        {
            check=true;

        }
        String pat = "^[a-zA-Z0-9]+";
            patcheck = word.matches(pat);
        for(int i=0;i<word.length();i++)
        {
            
            if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='O' || word.charAt(i)=='I' || word.charAt(i)=='U' || word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            {
                vow=true;
            }
            else{
                if(Character.isLetter(word.charAt(i)))
                    con=true;
            }
        }
        if(patcheck!=true || check!=true || vow!=true || con!=true)
        {
            return false;
        }
        return true;
    }
}
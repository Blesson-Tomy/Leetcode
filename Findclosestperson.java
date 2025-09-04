class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-y)!=Math.abs(z-x))
            return ((Math.abs(z-y)>Math.abs(z-x)))?1:2;
        else
            return 0;
    }
}
1class Solution {
2    public int findClosest(int x, int y, int z) {
3        if(Math.abs(x-z)==Math.abs(y-z)) return 0;
4        else if(Math.abs(x-z)<Math.abs(y-z)) return 1;
5        else return 2;
6        
7    }
8}
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max=0,x=0;
4        for(int i=0;i<gain.length;i++)
5        {
6            x += gain[i];
7            max=Math.max(max,x);
8        }
9
10        return max;
11    }
12}
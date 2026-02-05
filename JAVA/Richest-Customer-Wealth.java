1class Solution {
2    public int maximumWealth(int[][] accounts) {
3     int sum,max=0;
4     for(int[] customer: accounts)
5     {
6        sum = 0;
7        for(int wealth:customer )
8        {
9            sum+=wealth;
10        }
11        max = Math.max(max,sum);
12     }
13     return max;
14    }
15}
1class Solution {
2    public int[] getConcatenation(int[] a) {
3        int n= a.length;
4        int[] ans =  new int[n*2];
5        for(int i=0;i<n;i++)
6        {
7            ans[i]=a[i];
8            ans[i+n]=a[i];
9        }
10
11        return ans;
12    }
13}
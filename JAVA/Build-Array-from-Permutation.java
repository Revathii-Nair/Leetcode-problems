1class Solution {
2    public int[] buildArray(int[] a) {
3        int i,temp;
4        int[] ans = new int[a.length];
5        for(i=0;i<a.length;i++)
6        {
7            ans[i]=a[a[i]];
8        }
9
10        return ans;
11    }
12}
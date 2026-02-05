1class Solution {
2    public int[] sumZero(int n) {
3        int[] ans = new int[n];
4        for(int i=0;i<n;i++)
5            ans[i]=i*2-n+1;
6        return ans;
7    }
8}
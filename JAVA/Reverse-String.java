1class Solution {
2    public void reverseString(char[] s) {
3        int last=s.length-1;
4        char temp;
5        for(int i=0;i<s.length/2;i++)
6        {
7            temp=s[i];
8            s[i]=s[last];
9            s[last]=temp;
10            last--;
11        }
12        
13        
14    }
15}
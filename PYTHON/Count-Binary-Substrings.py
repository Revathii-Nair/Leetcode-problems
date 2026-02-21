1class Solution(object):
2    def countBinarySubstrings(self, s):
3        ans,prev,cur = 0,0,1 
4        for i in range(1,len(s)):
5            if s[i-1]!=s[i]:
6                ans+=min(prev,cur)
7                prev,cur = cur,1
8            else:
9                cur+=1
10        
11        return ans + min(prev,cur)
12
13
14
15
16
17        
18        

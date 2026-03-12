1class Solution(object):
2    def checkNext(self,s):
3        return s == s[::-1]
4        
5    def validPalindrome(self, s):
6        l,r = 0,len(s)-1
7        s = lower(s)
8        while l<r:
9            if s[l] != s[r]:
10                return self.checkNext(s[l+1:r+1]) or self.checkNext(s[l:r])
11            l+=1
12            r-=1
13        return True
14        
15
16        
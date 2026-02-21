1class Solution(object):
2    def lengthOfLongestSubstring(self, s):
3        left = count = 0
4        string= set()
5        for right in range(len(s)):
6            while s[right] in string:
7                string.remove(s[left])
8                left+=1
9            string.add(s[right])
10            count= max(count,right-left+1)
11        return count
12
13
14
15
16        
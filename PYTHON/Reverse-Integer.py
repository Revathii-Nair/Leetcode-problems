1class Solution(object):
2    def reverse(self, n):
3        if n<0:
4            ans = int(str(n)[1:][::-1]) * -1
5        else:
6            ans = int(str(n)[::-1])
7        
8        if ans > 2**31-1 or ans < -2**31:
9            return 0
10        return ans

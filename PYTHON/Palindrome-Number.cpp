1class Solution(object):
2    def isPalindrome(self, x):
3        if x%10==0 and x!=0:
4            return False
5        
6        x = str(x)
7        return x == x[::-1]
8
1class Solution(object):
2    def fib(self, n):
3        if n<=1:
4            return n
5        return self.fib(n-1)+self.fib(n-2)
6        

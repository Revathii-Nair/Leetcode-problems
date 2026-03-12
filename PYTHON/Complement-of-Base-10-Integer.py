1class Solution(object):
2    def bitwiseComplement(self, n):
3        if n ==0:
4            return 1
5        if n == 1:
6            return 0
7        mask =1
8        while mask<n:
9            mask =(mask<<1) | 1
10
11        return n^mask
12        
13
14
15
16
17        
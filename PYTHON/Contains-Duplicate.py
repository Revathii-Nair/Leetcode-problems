1class Solution(object):
2    def containsDuplicate(self, nums):
3
4        s = set(nums)     
5        if len(s) == len(nums):
6            return False
7        return True
8        
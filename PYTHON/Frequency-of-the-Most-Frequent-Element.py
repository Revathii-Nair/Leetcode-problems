1class Solution(object):
2    def maxFrequency(self, nums, k):
3        nums.sort()
4        l,r=0,0
5        res,total = 0,0
6        while r<len(nums):
7            total += nums[r]
8            while nums[r]*(r-l+1)>total+k:
9                total-=nums[l]
10                l+=1
11            res = max(res,r-l+1)
12            r+=1
13        return res
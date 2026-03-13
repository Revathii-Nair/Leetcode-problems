1class Solution(object):
2    def twoSum(self, nums, target):
3        l,r=0,len(nums)-1
4        while l<r:
5            sum = nums[l]+nums[r]
6            if sum==target:
7                return [l+1,r+1]
8            elif sum<target: l+=1
9            else: r-=1
10                    
11
12        
1class Solution(object):
2    def swap(self,nums,a,b):
3        nums[a],nums[b]=nums[b],nums[a]
4
5    def sortColors(self, nums):
6        p1,curr,p2=0,0,len(nums)-1
7        while curr<=p2:
8            if nums[curr]==0:
9                self.swap(nums,p1,curr)
10                p1+=1
11                curr+=1
12            elif nums[curr]==2:
13                self.swap(nums,p2,curr)
14                p2-=1
15            else:
16                curr+=1
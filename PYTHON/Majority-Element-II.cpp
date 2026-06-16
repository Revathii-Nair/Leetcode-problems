1class Solution(object):
2    def majorityElement(self, nums):
3        hm={}
4        ans=[]
5        n=len(nums)//3
6        for num in nums:
7            hm[num] = hm.get(num,0)+1
8        for key,value in hm.items():
9            if value>n:
10                ans.append(key)
11        return ans
12        
13        
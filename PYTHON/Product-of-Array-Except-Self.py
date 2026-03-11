1class Solution(object):
2    def productExceptSelf(self, nums):
3        prod=[1]*len(nums)
4        pre=1
5        for i in range(1,len(nums)):
6            prod[i]=prod[i-1]*nums[i-1]
7        
8        post =1
9        for i in range(len(nums)-1,-1,-1):
10            prod[i]*=post
11            post *=nums[i] 
12      
13        return prod
14
15        
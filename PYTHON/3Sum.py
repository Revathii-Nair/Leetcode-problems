1class Solution(object):
2    def threeSum(self, nums):
3        ans =[]
4        nums.sort()
5        for i,a in enumerate(nums):
6            if i> 0 and nums[i-1] == a:
7                continue
8            l,r=i+1,len(nums)-1
9            while l<r:
10                sum = a + nums[l] + nums[r]
11                if sum<0:l+=1
12                elif sum>0:r-=1
13                else:
14                    ans.append([a,nums[l],nums[r]])
15                    l+=1
16                    while nums[l] == nums[l-1] and l<r:
17                        l+=1
18        return ans
19                
20                        
21
22
23
24     
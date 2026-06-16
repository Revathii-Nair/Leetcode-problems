1class Solution(object):
2    def majorityElement(self, arr):
3        ans={}
4        majority=arr[0]
5        for i in arr:
6            ans[i] = ans.get(i,0) +1
7            if ans[i]>ans[majority]:
8                majority = i
9        return majority
10            
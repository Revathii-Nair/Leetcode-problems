1class Solution(object):
2    def maxArea(self, height):
3        maxArea=0
4        l,r=0,len(height)-1
5        while l<r:
6            if height[l]<=height[r]:
7                area =height[l]*(r-l)
8                l+=1
9            else:
10                area = height[r] * (r-l)
11                r-=1
12            if area>maxArea:maxArea=area
13        return maxArea
14        
15
16            
17           
18            
19            
20
21
22        
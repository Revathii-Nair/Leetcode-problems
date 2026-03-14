1class Solution(object):
2    def merge(self, nums1, m, nums2, n):
3        me,ne=m-1,n-1
4        max = m+n-1
5        while ne>=0:
6            if me>=0 and nums1[me]>nums2[ne]:
7                nums1[max]=nums1[me]
8                me-=1
9            else:
10                nums1[max] = nums2[ne]
11                ne-=1
12            max-=1
13
14
15
16       
17        
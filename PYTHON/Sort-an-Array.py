1
2class Solution(object):
3    def buildMinHeap(self,nums):
4        for i in range((len(nums)//2)-1,-1,-1):
5            self.heapify(nums,len(nums),i) 
6        
7    def heapsort(self,nums):
8        self.buildMinHeap(nums)
9        n = len(nums)
10        for i in range(n -1,-1,-1):
11            nums[0], nums[i] =nums[i],nums[0]
12            self.heapify(nums,i,0)
13    
14    def heapify(self,nums,n,i):
15        temp=0
16        smallest=i
17        left = 2*i+1
18        right = 2*i+2
19
20        if left<n and  nums[smallest]<nums[left] :
21            smallest = left
22
23        if right<n and nums[smallest]<nums[right] :
24            smallest = right
25        
26        if smallest!=i:
27            nums[i],nums[smallest] = nums[smallest],nums[i]
28            self.heapify(nums,n,smallest)
29
30    def sortArray(self, nums):
31        if not nums:
32            return nums
33        self.heapsort(nums)
34        return nums
35
36
37    
38       
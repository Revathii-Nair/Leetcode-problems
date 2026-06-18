1class Solution(object):
2    def search2D(self,arr,target,left,right,cols):
3        if left>right:
4            return False
5        mid = (left + right) //2
6        row= mid // cols
7        col = mid % cols
8        if arr[row][col] == target:
9            return True
10        if arr[row][col] > target:
11            return self.search2D(arr,target,left,mid-1,cols)
12        else:
13            return self.search2D(arr,target, mid+1 ,right,cols)
14
15    def searchMatrix(self, matrix, target):
16        rows,cols = len(matrix),len(matrix[0])
17        ans = self.search2D(matrix,target,0,rows * cols -1,cols)
18        return ans    

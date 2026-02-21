1class Solution(object):
2    def countPrimeSetBits(self, left, right):
3        """
4        :type left: int
5        :type right: int
6        :rtype: int
7        """
8        prime = [2,3,5,7,11,13,17,19,23,29]
9        count=0
10        for i in range(left,right+1):
11            binary = bin(i)[2:]
12            ones = binary.count('1')
13            if ones in prime:
14                count+=1
15        return count
16        

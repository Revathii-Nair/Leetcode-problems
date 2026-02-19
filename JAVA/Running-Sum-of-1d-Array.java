1class Solution {
2    public int[] runningSum(int[] nums) {
3        
4        for(int i=1;i<nums.length;i++)
5        {
6            nums[i] += nums[i-1];
7        }
8
9        return nums;
10    }
11}
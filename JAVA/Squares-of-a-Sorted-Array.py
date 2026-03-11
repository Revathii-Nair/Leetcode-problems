1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5        int left = 0;
6        int right = n - 1;
7
8        for (int i = n - 1; i >= 0; i--) {
9            int leftSquare = nums[left] * nums[left];
10            int rightSquare = nums[right] * nums[right];
11
12            if (leftSquare > rightSquare) {
13                result[i] = leftSquare;
14                left++;
15            } else {
16                result[i] = rightSquare;
17                right--;
18            }
19        }
20        return result;
21    }
22}
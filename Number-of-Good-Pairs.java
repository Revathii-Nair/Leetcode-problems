1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int count=0;
4        HashMap<Integer,Integer> hs = new HashMap<>();
5        for(int n: nums){
6            if(hs.containsKey(n)){
7                count+=hs.get(n);
8            }
9            hs.put(n,hs.getOrDefault(n,0)+1);   
10        }
11        return count;
12    }
13}
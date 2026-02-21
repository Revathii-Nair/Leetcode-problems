1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3       int left = 0, count = 0;
4       Set<Character> string = new HashSet<>();
5
6       for(int right=0;right<s.length();right++){
7        while(string.contains(s.charAt(right))){
8            string.remove(s.charAt(left));
9            left++;
10        }
11        count = Math.max(count,right-left+1);
12        string.add(s.charAt(right));
13       }
14
15       return count;
16    }
17}
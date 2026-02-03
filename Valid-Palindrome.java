1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
4        int last = s.length()-1;
5        boolean f=true;
6        for(int i=0;i<s.length()/2;i++){
7            if(s.charAt(i)!=s.charAt(last)){
8                return false;
9            }
10            last--;   
11        }
12        return f;  
13    }
14}
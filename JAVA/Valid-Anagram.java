1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
5        for(int i=0;i<s.length();i++){
6            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
7        }
8        for(int i=0;i<t.length();i++){
9            if(!hm.containsKey(t.charAt(i)) || hm.get(t.charAt(i))==0) return false;
10            hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
11        }
12        return true;   
13    }
14}
1class Solution {
2    public char repeatedCharacter(String s) {
3        
4        HashMap<Character,Integer> hm = new HashMap<>();
5        for(char c:s.toCharArray()){
6            hm.put(c,hm.getOrDefault(c,2)-1);
7            if(hm.get(c)==0){
8                return c; 
9            }
10        }
11
12        return ' ';
13    }
14}
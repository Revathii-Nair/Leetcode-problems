1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder res = new StringBuilder();
4        int p1 = a.length()-1;
5        int p2 = b.length()-1;
6        int carry = 0;
7        while(p1>=0 || p2>=0 || carry!=0){
8            int sum = carry;
9            if(p1>=0) sum += a.charAt(p1--)-'0';
10            if(p2>=0) sum += b.charAt(p2--) - '0';
11            carry = sum / 2;
12            res.append(sum % 2);
13        }
14        return res.reverse().toString();
15    }
16}
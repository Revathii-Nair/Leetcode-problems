1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count =0,ones;
4        for(int i =left; i<=right;i++)
5            if(isPrime(Integer.bitCount(i))) 
6                count++;
7        return count; 
8    }
9    public boolean isPrime(int number){
10        return (number == 2 || number == 3 || number == 5 || number == 7 || number == 11 || number == 13 || number == 17 || number == 19);
11    }
12}
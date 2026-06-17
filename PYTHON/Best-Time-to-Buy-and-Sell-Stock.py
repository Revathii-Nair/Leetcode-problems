1class Solution(object):
2    def maxProfit(self, prices):
3        profit = 0
4        buy = prices[0]
5        for price in prices[1:]:
6            if buy>price:
7                buy=price
8            elif price - buy > profit:
9                profit =  price - buy
10        return profit

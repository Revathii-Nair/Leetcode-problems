1class Solution(object):
2    def maxProfit(self, prices):
3        buy1, sell1 = -prices[0], 0
4        buy2, sell2 = -prices[0], 0
5        for price in prices:
6            buy1 = max(buy1, -price)          
7            sell1 = max(sell1, buy1 + price)  
8            buy2 = max(buy2, sell1 - price) 
9            sell2 = max(sell2, buy2 + price) 
10        return sell2
11
12            
13        
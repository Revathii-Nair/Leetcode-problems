1# Write your MySQL query statement below
2SELECT w2.id from Weather w1
3JOIN Weather w2 on DATEDIFF(w2.recordDate,w1.recordDate) = 1 
4where w1.temperature<w2.temperature
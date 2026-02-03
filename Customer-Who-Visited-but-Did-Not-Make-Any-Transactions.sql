1# Write your MySQL query statement below
2SELECT v.customer_id,count(*) as count_no_trans 
3FROM Visits v
4LEFT JOIN Transactions t ON t.visit_id = v.visit_id
5WHERE t.visit_id IS NULL
6GROUP BY v.customer_id 
7
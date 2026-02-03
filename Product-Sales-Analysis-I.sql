1# Write your MySQL query statement below
2Select p.product_name,s.year,s.price
3from Sales s inner join Product p
4on p.product_id = s.product_id
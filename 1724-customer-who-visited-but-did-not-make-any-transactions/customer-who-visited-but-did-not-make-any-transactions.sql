# Write your MySQL query statement below
select customer_id , count(customer_id) as count_no_trans from (select * from (select v.visit_id as visit_id, v.customer_id as customer_id, t.transaction_id as transaction_id from Visits v left join Transactions t 
on v.visit_id = t.visit_id) as combination where transaction_id is null) as final group by customer_id
# Write your MySQL query statement below
select email as Email from (
    select email,count(*) as ec from Person group by email
)t where ec>1;
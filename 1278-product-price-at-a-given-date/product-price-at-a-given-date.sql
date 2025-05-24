# Write your MySQL query statement below
SELECT product_id, new_price as price
FROM products
WHERE (product_id,change_date) IN (
    SELECT product_id, MAX(change_date)
    FROM products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
)

UNION

SELeCT product_id, 10 as price
FROM products 
WHERE product_id NOT IN (
    SELECT product_id
    FROM products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
)
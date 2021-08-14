SELECT O.product_name
FROM ORDERS O
         INNER JOIN CUSTOMERS C
                    ON O.customer_id = C.id
WHERE C.name LIKE :name;

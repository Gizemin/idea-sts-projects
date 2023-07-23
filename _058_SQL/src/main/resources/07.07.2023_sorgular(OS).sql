SELECT * FROM customers;

SELECT*FROM orders;

select*from shippings;


/*
select kolon isimleri
FROM tablo1A
JOIN tablo2B
ON ŞART;
 */

--- KLASIK JOIN (Bütün sütunları dahil etti)
SELECT*
FROM customers
         JOIN orders
              on orders.customer_id = customers.customer_id;



SELECT*
FROM customers
INNER JOIN orders
on orders.customer_id = customers.customer_id;

SELECT customers.customer_id, customers.first_name, customers.last_name, orders.item, orders.amount, orders.customer_id
FROM customers
INNER JOIN orders
on orders.customer_id = customers.customer_id;


-- Üstteki sorgunun aynısı lakap taktık.
SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers AS c
INNER JOIN orders AS o
on o.customer_id = c.customer_id;


-- Üstteki sorguların aynısı lakap takarken AS'leri cıkarttık
SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
INNER JOIN orders o
on o.customer_id = c.customer_id;

SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         LEFT JOIN orders o
                    on o.customer_id = c.customer_id;



SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         RIGHT JOIN orders o
                   on o.customer_id = c.customer_id;

SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         RIGHT JOIN orders o
                    on o.customer_id = c.customer_id
WHERE o.amount>500;

SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         LEFT JOIN orders o
                    on o.customer_id = c.customer_id
WHERE o.amount>500;


SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         FULL OUTER JOIN orders o
                   on o.customer_id = c.customer_id;














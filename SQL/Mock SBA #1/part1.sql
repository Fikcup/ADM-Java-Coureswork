USE mocksba;

SELECT o.order_id, CONCAT(u.first_name, ', ', u.last_name) AS "Customer"
  FROM orders o
JOIN users u USING (user_id)
  WHERE u.FIRST_NAME LIKE "Marion"
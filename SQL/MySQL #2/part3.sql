USE classicmodels;

SELECT DISTINCT o.status AS "Order Status", COUNT(o.status) AS "# Orders"
  FROM orders o
GROUP BY o.status
  ORDER BY o.status ASC;
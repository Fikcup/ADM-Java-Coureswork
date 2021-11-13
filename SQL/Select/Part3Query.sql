USE classicmodels;

SELECT status
  FROM orders
WHERE STATUS = 'Cancelled'
  ORDER BY status DESC;
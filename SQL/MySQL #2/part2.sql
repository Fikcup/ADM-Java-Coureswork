USE classicmodels;

SELECT p.productName AS "Product", quantityOrdered AS "Total # Ordered", SUM(quantityOrdered * priceEach) AS "Total Sale"
  FROM orderdetails o
JOIN products p USING (productCODE)
  GROUP BY productCODE
ORDER BY SUM(quantityOrdered * priceEach) DESC;
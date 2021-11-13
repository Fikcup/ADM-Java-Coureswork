USE classicmodels;

SELECT MONTHNAME(o.orderDate) AS "Month", YEAR(o.orderDate) AS "Year", SUM(d.quantityOrdered * d.priceEach) AS "Payments Received"
  FROM orders o
JOIN orderdetails d USING (orderNumber)
  GROUP BY YEAR(o.orderDate), MONTHNAME(o.orderDate)
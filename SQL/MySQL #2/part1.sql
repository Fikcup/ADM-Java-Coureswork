USE classicmodels;

SELECT c.customerName AS "Customer Name", concat(e.lastName, ', ', e.firstName) AS "Employee"
  FROM customers c
JOIN employees e ON (c.salesRepEmployeeNumber = e.employeeNumber)
  ORDER BY c.customerName ASC;
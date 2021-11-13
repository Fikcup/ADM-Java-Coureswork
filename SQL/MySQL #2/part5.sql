USE classicmodels;

SELECT c.customerName AS "Customer", CONCAT(e.lastName, ', ', e.firstName) AS "Sales Rep", d.quantityOrdered AS "# Orders", IFNULL(SUM(d.quantityOrdered * d.priceEach), 0.00) AS "Total Sales"
  FROM employees e
LEFT JOIN customers c ON (e.employeeNumber = c.salesRepEmployeeNumber)
  LEFT JOIN orders o USING (customerNumber)
LEFT JOIN orderdetails d USING (orderNumber)
  WHERE e.jobTitle = 'Sales Rep'
GROUP BY CONCAT(e.lastName, ', ', e.firstName)
  ORDER BY SUM(quantityOrdered * priceEach) DESC;
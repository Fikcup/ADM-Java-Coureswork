USE classicmodels;

SELECT * FROM payments
  WHERE paymentDate > '2005-01-01'
ORDER BY paymentDate ASC;
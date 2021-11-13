USE classicmodels;

SELECT productName, productLine, productScale, productVendor
  FROM products
WHERE productLine = 'vintage cars' OR productLine = 'classic cars'
  ORDER BY productName ASC, productLine;
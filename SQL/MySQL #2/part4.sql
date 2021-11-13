SELECT DISTINCT productLine AS "Product Line", COUNT(productLine) AS "# Sold"
  FROM products
GROUP BY productLine
  ORDER BY COUNT(productLine) DESC;
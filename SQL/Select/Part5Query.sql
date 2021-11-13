USE classicmodels;

SELECT lastName, firstName, email, jobTitle, officeCode
  FROM employees
WHERE officeCode = (SELECT officeCode FROM offices WHERE city = 'San Francisco')
  ORDER BY lastName DESC;
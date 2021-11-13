USE banking;

SELECT p. NAME AS "Product", a.AVAIL_BALANCE AS "Balance", i.LAST_NAME AS "Customer", o.LAST_NAME AS "Officer"
  FROM account a
JOIN product p ON (a.PRODUCT_CD = p.PRODUCT_CD)
  JOIN customer c ON (a.CUST_ID = c.CUST_ID)
JOIN individual i ON (a.CUST_ID = i.CUST_ID)
  JOIN officer o ON (a.cust_id = o.cust_id)
  ORDER BY i.LAST_NAME ASC;
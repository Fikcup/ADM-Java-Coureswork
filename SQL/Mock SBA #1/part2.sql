USE mocksba;

SELECT *
  FROM users
JOIN orders USING (USER_ID)
  WHERE 
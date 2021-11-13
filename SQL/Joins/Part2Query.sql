USE banking;

SELECT b.name, b.city, e.LAST_NAME, e.TITLE
  FROM branch b
JOIN employee e ON (b.BRANCH_ID = e.ASSIGNED_BRANCH_ID)
  ORDER BY b.name;
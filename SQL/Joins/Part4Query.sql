USE banking;

SELECT e.LAST_NAME AS "Employee", e.title AS "Job Title", b.LAST_name AS "Superior", b.TITLE AS "Job Title"
  FROM employee e
JOIN employee b ON (e.SUPERIOR_EMP_ID = b.EMP_ID)
  ORDER BY e.LAST_NAME;
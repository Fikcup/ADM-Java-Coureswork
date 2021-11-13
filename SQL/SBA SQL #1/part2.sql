USE SBAReal;

SELECT d.name, COUNT(c.name) AS "# Courses"
  FROM department d
JOIN course c ON (d.id = c.deptid)
  GROUP BY d.name
ORDER BY COUNT(c.name) ASC, d.name ASC;
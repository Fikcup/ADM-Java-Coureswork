USE SBAReal;

SELECT f.firstName, f.lastName, ROUND(MAX(sc.progress), 1) AS "averageProgress"
  FROM faculty f  
JOIN department d ON (d.id = f.deptid)
  JOIN course c ON (d.id = c.deptId)
JOIN studentcourse sc ON (c.id = sc.courseid)
  GROUP BY c.name
HAVING MAX(sc.progress) >= 90
  ORDER BY averageProgress DESC, f.firstName ASC, f.lastname ASC;
  
/* 
How I can succeed without getting this problem correct:
(100/13)*12 = 92.3077
*/
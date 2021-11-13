USE SBAReal;

SELECT s.firstName, s.lastName, ROUND(AVG(sc.progress), 1) AS "Progress"
  FROM student s
JOIN studentcourse sc ON (s.id = sc.studentId)
  WHERE progress < 50
GROUP BY s.id
  ORDER BY progress DESC, s.firstName ASC, s.lastName ASC;
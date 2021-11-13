USE SBAReal;

SELECT s.firstName, s.lastName, ROUND(AVG(sc.progress), 1) AS "Average Progress"
  FROM student s
JOIN studentcourse sc ON (s.id = sc.studentId)
  GROUP BY s.id
ORDER BY ROUND(AVG(sc.progress), 1) DESC, s.firstName ASC, s.lastName ASC;
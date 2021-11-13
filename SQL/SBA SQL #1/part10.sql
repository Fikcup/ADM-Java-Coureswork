USE SBAReal;

SELECT c.name, ROUND(AVG(sc.progress), 1) AS "Average Student Progress"
  FROM course c
JOIN studentcourse sc ON (c.id = sc.courseId)
  GROUP BY c.name
ORDER BY ROUND(AVG(sc.progress), 1) DESC; 
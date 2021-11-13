USE SBAReal;

SELECT c.name, COUNT(sc.studentId) AS "# of Students"
  FROM studentcourse sc
JOIN course c ON (sc.courseId = c.id)
  GROUP BY c.name
ORDER BY COUNT(sc.studentId) DESC, c.name ASC
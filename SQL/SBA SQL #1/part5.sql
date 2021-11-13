USE SBAReal;

SELECT c.name, fc.facultyId, COUNT(sc.studentid) AS "# of Students"
  FROM course c
LEFT JOIN facultycourse fc ON (c.id = fc.courseId)
  JOIN studentcourse sc ON (sc.courseId - c.id)
WHERE fc.facultyId IS NULL
  GROUP BY c.name
ORDER BY COUNT(sc.studentid) DESC, c.name ASC;
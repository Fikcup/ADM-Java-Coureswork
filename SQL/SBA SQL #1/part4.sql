USE SBAReal;

SELECT c.name
  FROM course c
LEFT JOIN facultycourse fc ON (c.id = fc.courseId)
  WHERE facultyid IS NULL
GROUP BY c.name
  ORDER BY c.name ASC;
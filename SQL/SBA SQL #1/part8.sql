USE SBAReal;

SELECT s.firstName, s.lastName, COUNT(sc.courseid) AS "# of Courses"
  FROM student s
JOIN studentcourse sc ON (s.id = sc.studentid)
  JOIN course c ON (c.id = sc.courseid)    
WHERE c.deptId = s.majorId
  GROUP BY sc.studentid
ORDER BY COUNT(sc.courseid) DESC, s.firstName ASC, s.lastname ASC;                                                                                                                                                                    
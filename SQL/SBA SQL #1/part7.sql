USE SBAReal;

SELECT sc.startDate, COUNT(sc.studentId) AS "totalStudents"
  FROM studentcourse sc
WHERE MONTHNAME(sc.startDate) = 'August'
  GROUP BY YEAR(sc.startDate)
ORDER BY sc.startdate ASC, totalStudents ASC;
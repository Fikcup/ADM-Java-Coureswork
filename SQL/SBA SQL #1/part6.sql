USE SBAReal;

SELECT YEAR(sc.startDate) AS "Year", COUNT(DISTINCT sc.studentId) AS "# of Students"
  FROM studentcourse sc
GROUP BY YEAR(sc.startDate);
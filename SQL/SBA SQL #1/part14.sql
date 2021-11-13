USE SBAReal;

SELECT s.firstName, s.lastName, CASE
  WHEN MIN(sc.progress) < 40 THEN 'F'
  WHEN MIN(sc.progress) < 50 THEN 'D'
  WHEN MIN(sc.progress) < 60 THEN 'C'
  WHEN MIN(sc.progress) < 70 THEN 'B'
  WHEN MIN(sc.progress) >= 70 THEN 'A'
  ELSE NULL
END
  AS "minimumGrade",
  CASE
  WHEN MAX(sc.progress) < 40 THEN 'F'
  WHEN MAX(sc.progress) < 50 THEN 'D'
  WHEN MAX(sc.progress) < 60 THEN 'C'
  WHEN MAX(sc.progress) < 70 THEN 'B'
  WHEN MAX(sc.progress) >= 70 THEN 'A'
  ELSE NULL
END
  AS "maximumGrade"
FROM student s
  JOIN studentcourse sc ON (sc.studentid = s.id)
GROUP BY s.id
  ORDER BY minimumGrade DESC, maximumGrade DESC, s.firstName ASC, s.lastname ASC;
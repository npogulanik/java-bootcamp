-- Queries High School

-- Exercise 5

SELECT student_takes_course.Final_note 
FROM student_takes_course, student
WHERE (student.First_name = 'Steve')
	AND (student.Registration_number = student_takes_course.Student_Registration_number); 

SELECT student_takes_course.Final_note 
FROM student_takes_course, student
WHERE (student.Registration_number = 19)
	AND (student.Registration_number = student_takes_course.Student_Registration_number); 

-- Optimising queries

SELECT student_takes_course.Final_note 
FROM student_takes_course
INNER JOIN student
ON student.Registration_number = student_takes_course.Student_Registration_number
WHERE (student.First_name = 'Steve');

SELECT student_takes_course.Final_note 
FROM student_takes_course
INNER JOIN student
ON student.Registration_number = student_takes_course.Student_Registration_number
WHERE (student.Registration_number = 19);

-- Exercise 6 (Percentage of students that passed/failed a given course.)
-- I just could count, I wasn't able to calculate the percentage

SELECT course.Name, COUNT( student.Registration_number) 
FROM student 
INNER JOIN student_takes_course
ON student.Registration_number = student_takes_course.Student_Registration_number
INNER JOIN course
ON course.idCourse = student_takes_course.Course_idCourse
WHERE (idCourse = 5 ) AND (student_takes_course.Final_note >= 7);


/*Exercise 7
For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name. The format should be:
Teacher: <last-name>, <first-name>
Schedule:
  Monday 09:00 - 11:00: <course-name>
  Monday 15:00 - 17:30: <course-name>
  Friday 08:45 - 10:40: <course-name>
  */

--  I know how to use "ORDER BY()" but my model don't suport dates in the course 
--  How can I do it?

ALTER TABLE `highschool`.`schedule` 
CHANGE COLUMN `To` `To_` TIME NULL DEFAULT NULL ;

-- This lists the teachers

SELECT highschool.teacher.First_name, highschool.teacher.Last_name
FROM teacher
INNER JOIN course
ON Teacher = idTeacher
WHERE idCourse = 5;
 
--  This lists the schedule  of the course an its name

SELECT schedule.Day, schedule.Since, schedule.To_, course.Name 
FROM schedule
INNER JOIN course
ON idCourse = Course_idCourse
WHERE idCourse = 5;

--   How can I combine both?


/*Exercise 9
Create a table for students that have more than 1 partial note with a value less than 7. 
The table should contain the following information:
Student name
Course name
Average Note
*/
--  This lists the students with a partial note below 7

SELECT student.Registration_number
FROM student
INNER JOIN student_takes_course
ON Student_Registration_number = Registration_number
WHERE ( First_partial_note < 7 )
	OR (Second_partial_note < 7)
    OR ( Third_partial_note < 7);

 --  To sum up, my problems are:
 ----- Complex queries, composed queries
 ----- calculating average note when the notes are in different columns of the same table
 ----- inserting data from a table to anothe table
 



--  Generate teacher data

INSERT INTO `teacher` (`idTeacher`,`First_name`,`Last_name`,`Date_of_birth`)
VALUES (1, "Miguel","Vargas","0000-00-00");

INSERT INTO `teacher` (`idTeacher`,`First_name`,`Last_name`,`Date_of_birth`)
VALUES (2, "Dario","Vallejos","1990-5-12");

INSERT INTO `teacher` (`idTeacher`,`First_name`,`Last_name`,`Date_of_birth`)
 VALUES (3, "Nicolas","Pogulanik","1810-05-25");

--  Generate  Course data

INSERT INTO `highschool`.`course` (`idCourse`, `Name`, `Hours_by_week`, `Teacher`)
 VALUES ('1', 'java', '8', '1');

 INSERT INTO `highschool`.`course` (`idCourse`, `Name`, `Hours_by_week`, `Teacher`)
 VALUES ('2', 'Algorithms & Data Strucutre', '4', '1');
 
 INSERT INTO `highschool`.`course` (`idCourse`, `Name`, `Hours_by_week`, `Teacher`)
 VALUES ('3', 'Spring & Hybernate', '8', '2');
 
 INSERT INTO `highschool`.`course` (`idCourse`, `Name`, `Hours_by_week`, `Teacher`)
 VALUES ('4', 'Java II', '8', '2');
 
 INSERT INTO `highschool`.`course` (`idCourse`, `Name`, `Hours_by_week`, `Teacher`)
 VALUES ('5', 'Mongo DB', '8', '3');

-- Correcting a modeling defect by adding a column

alter table schedule add (Day varchar (10) );

 -- Generate  Schedule data

 INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('1', '10:00:00', '14:00:00', '1', 'Tuesday');

  INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('2', '16:30:00', '20:30:00', '1', 'Wednesday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('3', '10:00:00', '14:00:00', '2', 'Saturday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('4', '8:00:00', '12:00:00', '3', 'Monday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('5', '14:00:00', '18:00:00', '3', 'Monday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('6', '8:00:00', '12:00:00', '4', 'Thursday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('7', '14:00:00', '18:00:00', '4', 'Thursday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('8', '8:00:00', '12:00:00', '5', 'Friday');
  
INSERT INTO `highschool`.`schedule` (`idSchedule`, `Since`, `To`, `Course_idCourse`, `Day`)
  VALUES ('9', '14:00:00', '18:00:00', '5', 'Friday');


-- Generate  Student data


INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('1', 'Stella', 'Romero', '1988-06-11');

 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('2', 'Agustin', 'Dominguez', '1991-07-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('3', 'Lionel', 'Messi', '1988-07-05');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('4', 'Arjen', 'Robben', '1991-07-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('5', 'Cristiano', 'Ronaldo', '1986-03-1');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('6', 'Wayne', 'Rooney', '1956-08-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('7', 'Diego', 'Maradona', '1960-05-7');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('8', 'Mirtha', 'Legrand', '0000-00-00');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('9', 'Max', 'Power', '1997-08-3');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('10', 'Kun', 'Aguero', '1989-07-29');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('11', 'Mickey', 'Mouse', '1900-08-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('12', 'Mother', 'Fucker', '1845-05-23');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('13', 'Fiodor', 'Dostoievsky', '1852-09-15');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('14', 'Clark', 'Kent', '1915-06-12');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('15', 'Bruce', 'Wayne', '1936-03-11');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('16', 'Sigmund', 'Freud', '1880-08-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('17', 'Tony', 'Stark', '1988-03-03');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('18', 'Steve', 'Rogers', '1940-01-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('19', 'Peter', 'Parker', '1992-08-10');
 
 INSERT INTO `highschool`.`student` (`Registration_number`, `First_name`, `Last_name`, `Date_of_birth`)
 VALUES ('20', 'Flash', 'Gordon', '1942-09-09');

-- Generate  student_takes_course data

 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('1', '1', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('2', '1', '5', '8', '5', '6');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('2', '3', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('3', '1', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('4', '1', '7', '8', '9', '7');
 
 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('4', '5', '3', '2', '9', '3');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('5', '4', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('6', '3', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('8', '2', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('9', '4', '7', '8', '9', '7');
 
 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('9', '2', '5', '7', '4', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('10', '2', '7', '8', '4', '10');
 
 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('10', '4', '7', '8', '5', '9');
 
 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('11', '1', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('12', '2', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('13', '3', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('14', '5', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('15', '3', '7', '8', '3', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('16', '4', '7', '8', '9', '7');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('17', '5', '7', '8', '9', '6');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('18', '1', '7', '8', '3', '3');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('19', '1', '4', '5', '4', '5');
 
 INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('19', '3', '10', '8', '9', '9');

INSERT INTO `highschool`.`student_takes_course` 
(`Student_Registration_number`, `Course_idCourse`, `First_partial_note`, `Second_partial_note`, `Third_partial_note`, `Final_note`)
 VALUES ('20', '2', '6', '6', '6', '6');





CREATE TABLE notes 
(
  id          BIGINT NOT NULL Primary Key AUTO_INCREMENT,
  title       VARCHAR(255),
  date        VARCHAR(255),
  courseId    BIGINT
) ;

CREATE TABLE courses 
(
  id          BIGINT NOT NULL Primary Key AUTO_INCREMENT,
  courseName  VARCHAR(255),
  courseCode  VARCHAR(255)
) ;

ALTER TABLE notes
  ADD CONSTRAINT notes_fk FOREIGN KEY (courseId)
  REFERENCES courses (id);

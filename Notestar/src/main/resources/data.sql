INSERT INTO courses (courseName, courseCode) 
VALUES ('Database Design and Implement', 'DBAS27198');

INSERT INTO notes (title, date, courseId) 
VALUES ('Note 1', '01-01-2022', 1);
	
INSERT INTO sec_user (userName, encryptedPassword, ENABLED)
VALUES ('admin', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('annie', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('xiaoya', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('mihye', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('jenny', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1);
	
INSERT INTO sec_role (roleName)
VALUES ('ROLE_ADMIN'),
	   ('ROLE_USER');

insert into user_role (userId, roleId)
values (1, 1),
	   (2, 2),
	   (3, 2),
	   (4, 2),
	   (5, 2);

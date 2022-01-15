INSERT INTO courses (courseName, courseCode) 
VALUES ('Database Design and Implement', 'DBAS27198');

INSERT INTO notes (title, date, courseId) 
VALUES ('Note 1', '01-01-2022', 1);
	
INSERT INTO sec_user (userName, encryptedPassword, ENABLED)
VALUES ('Jon', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Ami', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Jake', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Rosa', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Terry', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Ray', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Charles', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Gina', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Scully', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1),
	   ('Michael', '$2a$10$L6I8M5Fzh50c6/24yi9c1.nenB4g40FLDvVI3wx2xR87lhqbUzO8W', 1);
	
INSERT INTO sec_role (roleName)
VALUES ('ROLE_ADMIN'),
	   ('ROLE_USER');

insert into user_role (userId, roleId)
values (1, 1),
	   (2, 2),
	   (3, 2),
	   (4, 2),
	   (5, 2),
	   (6, 2),
	   (7, 2),
	   (8, 2),
	   (9, 2),
	   (10, 2);

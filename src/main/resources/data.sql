insert into subject (subject_code, title, credit) values ('INT101', 'Computer Programming I', 1);
insert into subject (subject_code, title, credit) values ('INT102', 'Computer Programming 2', 2);
insert into subject (subject_code, title, credit) values ('INT103', 'Computer Programming 3', 3);
insert into subject (subject_code, title, credit) values ('INT104', 'Computer Programming 4', 4);
insert into subject (subject_code, title, credit) values ('INT105', 'Computer Programming 5', 5);

insert into student values (09901, 'Somchai');
insert into student values (09902, 'Apichart');
insert into student values (09903, 'Preeda');
insert into student values (09904, 'Kitichai');
insert into student values (09905, 'Satiya');
insert into student values (09906, 'Meechai');
insert into student values (09907, 'Srisupa');
insert into student values (09908, 'Daranee');
insert into student values (09909, 'Nittaya');

insert into student_grade (student_id, subject_id, grade) values(09901, 1, 3.5);
insert into student_grade (student_id, subject_id, grade) values(09901, 3, 2.5);
insert into student_grade (student_id, subject_id, grade) values(09901, 4, 4);
insert into student_grade (student_id, subject_id, grade) values(09902, 1, 2.5);
insert into student_grade (student_id, subject_id, grade) values(09902, 5, 2.0);
insert into student_grade (student_id, subject_id, grade) values(09903, 1, 2.5);
insert into student_grade (student_id, subject_id, grade) values(09904, 1, 3.5);
insert into student_grade (student_id, subject_id, grade) values(09905, 1, 3.0);
insert into student_grade (student_id, subject_id, grade) values(09905, 2, 4.0);
insert into student_grade (student_id, subject_id, grade) values(09907, 1, 3.0);
insert into student_grade (student_id, subject_id, grade) values(09907, 2, 4.0);
insert into student_grade (student_id, subject_id, grade) values(09908, 1, 3.0);
insert into student_grade (student_id, subject_id, grade) values(09909, 2, 2.5);
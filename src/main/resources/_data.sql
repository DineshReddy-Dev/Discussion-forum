-- init data

-- User Data
INSERT INTO `T_USER` (username, password, email, activated, date_created, bio, roles) VALUES ('admin', '$2a$10$HiaJpKERbSfcZcuG5vcvlOZDG6Y/5SkDKi9RvKsSK3t3Spl9.7u6u', 'admin@admin.com', 1, '2017-11-02', 'admin bio', 'ADMIN,USER');
INSERT INTO `T_USER` (username, password, email, activated, date_created, bio, roles) VALUES ('user', '$2a$10$Dr2lvPjmjiMuWf3mcMlyQeSbxFHI5LDLudHIB/fK/uygI1pnKk/3m', 'user@user.com', 1, '2017-11-02', 'user bio', 'USER');

-- Category Data
INSERT INTO `T_CATEGORY` (name, weight, display_name, username, date_created) VALUES ('java', 1, 'Java', 'admin', '2017-11-02');
INSERT INTO `T_CATEGORY` (name, weight, display_name, username, date_created) VALUES ('python', 2, 'Python', 'user', '2017-11-02');
INSERT INTO `T_CATEGORY` (name, weight, display_name, username, date_created) VALUES ('job-hunting', 3, '求职', 'user', '2017-11-02');

-- Post Data
INSERT INTO `T_POST` (title, body, date_created, user_id, category_id) VALUES (
'test', 
'test, test,test,test，test,test，test，test
,test。', 
'2017-10-01 23:23:23', 2, 1);


-- comments data
INSERT INTO `T_COMMENT` (post_id, user_id, body, date_created) VALUES (
52, 1, "test", '2017-11-23 23:23:23');



CREATE TABLE topics(
    id bigint NOT NULL auto_increment,
    title varchar(100) not null,
    message varchar(300) NOT NULL,
    creation_date DATETIME,
    last_modified_date DATETIME,
    status varchar(40) NOT NULL DEFAULT 'NO_RESPONDIDO',
    `user_id` bigint NOT NULL,
    course_id bigint NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (`user_id`) REFERENCES alura_foro.users(id),
    FOREIGN KEY (course_id) REFERENCES alura_foro.courses(id)
    );
CREATE TABLE responses (
    id bigint NOT NULL auto_increment,
    creation_date DATETIME,
    last_modified_date DATETIME,
    message varchar(300) NOT NULL,
    solution BOOLEAN NOT NULL DEFAULT FALSE,
    `user_id` bigint NOT NULL,
    `topic_id` bigint NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (`user_id`) REFERENCES alura_foro.users(id),
    FOREIGN KEY (`topic_id`) REFERENCES alura_foro.topics(id)
);
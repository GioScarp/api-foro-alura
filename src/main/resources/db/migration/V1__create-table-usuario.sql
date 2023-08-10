CREATE TABLE users
(
    id bigint NOT NULL auto_increment,
    `user_name` varchar(100) not null unique,
    email varchar(100) not null unique,
    password varchar(300) NOT NULL,
    creation_date DATETIME,
    last_modified_date DATETIME,
    active BOOLEAN NOT NULL DEFAULT 1,

    PRIMARY KEY (id)
);
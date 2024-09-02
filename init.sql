CREATE SEQUENCE user_id_seq;

CREATE TABLE users (
    id    bigint DEFAULT nextval('user_id_seq'::regclass) NOT NULL
        CONSTRAINT user_pkey PRIMARY KEY,
    name  varchar(255) NOT NULL,
    email varchar(255) NOT NULL
);

ALTER TABLE users OWNER TO admin;
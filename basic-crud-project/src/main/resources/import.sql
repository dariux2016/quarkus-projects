create table items (
       id bigint auto_increment,
       name varchar(255), 
       count varchar(255),
       status varchar(255),
       primary key (id)
    );

INSERT INTO items (name, count, status) VALUES ('first', '3', 'open');
INSERT INTO items (name, count, status) VALUES ('second', '5', 'closed');
INSERT INTO items (name, count, status) VALUES ('third', '2', 'closed');


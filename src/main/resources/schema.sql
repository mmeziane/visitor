create table visitor
(
   id integer not null,
   firstname varchar(255) not null,
   lastname varchar(255) not null,
   primary key(id)
);

create table book
(
   id integer not null,
   title varchar(255) not null,
   primary key(id)
);
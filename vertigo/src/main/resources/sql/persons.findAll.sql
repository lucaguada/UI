persons.create = create table if not exists person(id varchar(36) not null, first_name varchar(50) not null, last_name varchar(50), primary key (id))
persons.findAll = select id, first_name, last_name from persons;
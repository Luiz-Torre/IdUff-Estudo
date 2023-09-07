create table account(

    id bigint not null auto_increment,
    cpf varchar(11) not null unique,
    password varchar(50) not null,


    primary key (id)
)
create table car (
    id bigint not null,
    model varchar(255),
    color varchar(255),
    driver bigint,
    production int
);

create table driver (
    id bigint not null,
    name varchar(255),
    surname varchar(255),
    phone varchar(255),
    address varchar(255)
);

create table wash (
    id bigint not null,
    price bigint,
    wash_date DATE,
    car bigint
);

alter table car add constraint car_pk primary key (id);
alter table driver add constraint driver_pk primary key (id);
alter table wash add constraint wash_pk primary key (id);
alter table car add constraint car_driver_fk foreign key (driver) references driver (id);
alter table wash add constraint wash_car_pk foreign key (car) references car (id);

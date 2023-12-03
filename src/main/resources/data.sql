insert into driver (id, name, surname, phone, address) values (1, 'John', 'Smith', '+420 123 456 789', 'Address_John');
insert into driver (id, name, surname, phone, address) values (2, 'John', 'Doe', '+420 123 456 789', 'Address_John_Doe');
insert into driver (id, name, surname, phone, address) values (3, 'Robert', 'Smith', '+420 123 456 789', 'Address_Robert');
insert into driver (id, name, surname, phone, address) values (4, 'Alex', 'Smirnov', '+420 123 456 789', 'Address_Alex');

insert into car (id, model, color, driver, production) values (1, 'Ford', 'Black', 1, 2015);
insert into car (id, model, color, driver, production) values (2, 'VolksWagen', 'White', 2, 2016);
insert into car (id, model, color, driver, production) values (3, 'Fiat', 'Red', 3, 2017);
insert into car (id, model, color, driver, production) values (4, 'BMW', 'Yellow', 4, 2018);

insert into wash (id, price, wash_date, car) values (1, 10, current_date, 1);
insert into wash (id, price, wash_date, car) values (2, 20, current_date, 2);
insert into wash (id, price, wash_date, car) values (3, 10, current_date, 3);
insert into wash (id, price, wash_date, car) values (4, 10, current_date, 4);
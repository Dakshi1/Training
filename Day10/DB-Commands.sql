--command to create table
create table employees(
    empid int primary key,
    name varchar(50) not null,
    email varchar(100) unique not null,
    phone varchar(15) unique,
    salary double
);


insert into employees(empid, name, email, phone, salary)
    values(148666, 'Dakshi Suri', 'dakshi884@gmail.com', 8081901265, 100);

insert into employees(empid, name, email, phone, salary)
    values(148667, 'Anant', 'antoo.g23@gmail.com', 8080808080, 100);


alter table employees
modify salary double default 20000;

insert into employees
    values(148668, 'Neeraj', 'Neerajntoo.g23@gmail.com', null, null);

insert into employees
    values(148669, 'Sagar', 'sagar.g23@gmail.com');// wrong


insert into employees(empid, name, email)
    values(148669, 'Sagar', 'sagar.g23@gmail.com');// correct


update employees set
phone = '9876543210',
salary=25250
where empid=148668;

update employees set
email='neeraj@gmail.com'
where empid=148668;

-- selecting data from more than one table is 'JOIN operation'

select * from employees where salary between 100 and 30000;
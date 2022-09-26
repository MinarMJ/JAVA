use anudp;
show tables;
create table Employee( EmployeeId int(6) , lastname varchar(25) , job_id varchar(10), salary double(8,2) , comm_pct double(4,2), mgr_id int(6), department_Id int(4));
insert into Employee values (198, 'min', 'clerk', 2600, 2.5, 124, 50);
insert into Employee values (199, 'ani', 'clerk', 2600, 2.2, 124, 50);
insert into Employee values (200, 'asd', 'Ad_Ass', 4400, 1.3, 101, 10);
insert into Employee values (201, 'qwe', 'prog', 6000, null, 100, 20);
insert into Employee values (202, 'wer', 'ac_mgr', 6500, null, 210, 20);
insert into Employee values (203, 'frog', 'ad_vp', 7500, null, 101, 40);
insert into Employee values (204, 'dog', 'ad_pres', 3500, 1.5, 101, 90);
insert into Employee values (205, 'catone', 'ac_mgr', 2300, null, 101, 60);
insert into Employee values (206, 'gitz', 'prog', 5000, null, 103, 60);
insert into Employee values (100, 'attt', 'Ad_asst', 8956, 0.3, 108, 100);
insert into Employee values (101, 'kochar', 'clerk', 3400, 1.3, 118, 30);

select employeeid , lastname, job_id from employee;

select * from employee where department_id = 60;

select * from employee where lastname = 'attt';

select distinct(job_id) as 'job_details' from employee;

 select salary , (salary+30) as 'increased_salary' from employee;
 
 select lastname,  salary , (salary*12)+100 as 'annual_compensasion' from employee;
 
 select * from employee where comm_pct is not null;
 
  select * from employee where comm_pct is null;
  
  select employeeId, department_Id from employee where salary>5000 ;
  
 select lastname from employee where salary between 5000 and 7000 ; 
 
  select * from employee where salary = 6000 or 65000 or 7000 ; 
  
  select * from employee where department_id = 10 or 20 or 30 or 50;
  
  select * from employee where salary != 5000;
  
  select * from employee where job_id = 'clerk';
  
  update employee set job_id= 'grade_A' where salary>5000; 
  use pd1;
  select * from employee;
  update employee set job_id= 'grade_A' where salary>5000; 
  
  select * from employee where job_id = 'CLERK 'or job_id='PROG' or job_id='AD_ASST';
  
  select lastname, mgr_id from employee where salary >3000 and mgr_id = 101;
  
  
 
 
 

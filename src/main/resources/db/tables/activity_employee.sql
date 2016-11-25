create table activity_employee (
  id number not null,
  activity_id NUMBER not null,
  employee_id number not null,
  points number,
  approved char(1)
);
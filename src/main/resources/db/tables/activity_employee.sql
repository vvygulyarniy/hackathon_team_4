create table activity_employee (
  id           number not null,
  activity_id  NUMBER not null,
  employee_id  number not null,
  is_organizer CHAR(1),
  points       number,
  approved     char(1)
);

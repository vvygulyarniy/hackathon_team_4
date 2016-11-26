CREATE VIEW organizer_points
AS SELECT
     employee_id,
     sum(points) total_points
   FROM activity_employee
   WHERE approved IS NOT NULL AND is_organizer IS NOT NULL;

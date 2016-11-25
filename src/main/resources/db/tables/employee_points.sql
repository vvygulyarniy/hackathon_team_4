create VIEW employee_points
  AS select employee_id, sum(points) total_points from activity_employee where approved is not null;
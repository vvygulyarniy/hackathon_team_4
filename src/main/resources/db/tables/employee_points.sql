create VIEW employee_points
AS SELECT
     ae.employee_id,
     a.company_value,
     sum(ae.points) total_points
   FROM activity_employee ae
     JOIN company_activity a ON a.id = ae.activity_id
   WHERE ae.approved IS NOT NULL
   GROUP BY a.company_value;

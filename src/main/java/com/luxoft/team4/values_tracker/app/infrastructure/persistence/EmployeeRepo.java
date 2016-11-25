package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.logic.domain.Employee;
import com.luxoft.team4.values_tracker.app.logic.domain.EmployeePoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

/**
 * Created by vadim.vygulyarniy
 */
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	@Query("select p from EmployeePoints p where p.employeeId = ?1")
	EmployeePoints getEmployeePoints(long employeeId);
}

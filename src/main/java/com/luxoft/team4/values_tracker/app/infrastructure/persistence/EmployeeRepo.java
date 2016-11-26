package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue;
import com.luxoft.team4.values_tracker.app.logic.domain.Employee;
import com.luxoft.team4.values_tracker.app.logic.domain.EmployeePoints;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by vadim.vygulyarniy
 */
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@Query(value = "select new EmployeePoints(ae.employee, sum(ae.points)) " +
			"from ActivityEmployee ae " +
			"where ae.activity.companyValue = ?1 group by ae.activity.companyValue order by sum(ae.points) desc ")
	List<EmployeePoints> getTopEmployeesByCompanyValue(CompanyValue companyValue, Pageable pageable);

	@Query(value = "select new EmployeePoints(ae.employee, sum(ae.points)) " +
			"from ActivityEmployee ae " +
			"where ae.activity.companyValue = ?1 " +
			"and ae.activity.organizer = ae.employee " +
			"group by ae.activity.companyValue order by sum(ae.points) desc ")
	List<EmployeePoints> getTopOrganizersByCompanyValue(CompanyValue companyValue, Pageable pageRequest);
}

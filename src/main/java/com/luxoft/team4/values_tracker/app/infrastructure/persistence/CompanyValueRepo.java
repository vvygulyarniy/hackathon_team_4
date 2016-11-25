package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue;
import com.luxoft.team4.values_tracker.app.logic.domain.ValuePoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by vadim.vygulyarniy
 */
@Component
public interface CompanyValueRepo extends JpaRepository<ValuePoints, CompanyValue> {
}

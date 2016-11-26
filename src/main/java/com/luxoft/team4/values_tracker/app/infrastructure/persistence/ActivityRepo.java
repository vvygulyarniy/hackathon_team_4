package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.logic.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ActivityRepo extends JpaRepository<Activity, Long> {

}

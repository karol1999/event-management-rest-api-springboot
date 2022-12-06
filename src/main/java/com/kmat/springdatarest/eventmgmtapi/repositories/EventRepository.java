package com.kmat.springdatarest.eventmgmtapi.repositories;

import com.kmat.springdatarest.eventmgmtapi.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}

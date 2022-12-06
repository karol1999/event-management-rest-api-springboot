package com.kmat.springdatarest.eventmgmtapi.repositories;

import com.kmat.springdatarest.eventmgmtapi.models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}

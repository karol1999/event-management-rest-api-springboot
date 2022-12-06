package com.kmat.springdatarest.eventmgmtapi.repositories;

import com.kmat.springdatarest.eventmgmtapi.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {


}

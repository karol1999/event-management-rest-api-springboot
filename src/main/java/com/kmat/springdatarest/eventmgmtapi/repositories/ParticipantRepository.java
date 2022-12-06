package com.kmat.springdatarest.eventmgmtapi.repositories;

import com.kmat.springdatarest.eventmgmtapi.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}

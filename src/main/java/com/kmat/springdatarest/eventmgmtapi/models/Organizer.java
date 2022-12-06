package com.kmat.springdatarest.eventmgmtapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Organizer extends AbstractEntity {

    private String name;

    // mapping is happening from the organizer on to the event
    @OneToMany(mappedBy = "organizer")
    private Set<Event> event;

}

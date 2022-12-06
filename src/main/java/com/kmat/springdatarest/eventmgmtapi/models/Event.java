package com.kmat.springdatarest.eventmgmtapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.annotation.RestResource;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

@Data // getters, setters, toString, hashCode, equals
@AllArgsConstructor // generates all args constructor
@NoArgsConstructor // will generate a constructor with no parameters
@Entity
public class Event extends AbstractEntity {

    private String name;

    // fetch info about organizer right away
    // whenever organizer is deleted all events should be deleted -> CascadeType.ALL
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Organizer organizer;

    // if the participants are not associated with an event, delete them -> orphanRemoval
    // mappedBy = "event" -> ensure that the mapping is from the event to the participant
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Participant> participants;

    // without it behaves as a link (event-venue) but with @RestResource it will be embedded
    // beacuse without embeddedness POST method create event with venue null
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @RestResource(exported = false)
    private Venue venue;

    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;

    public Long getResourceId() {
        return this.id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return Objects.equals(id, ((Event) obj).id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    // organizer, venue

}

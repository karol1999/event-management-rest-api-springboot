package com.kmat.springdatarest.eventmgmtapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Participant extends AbstractEntity {

    @Column(nullable = false) // make field mandatory
    private String name;
    @Column(nullable = false)
    private String email;
    private Boolean checkedIn;

    // referent to event ID
    // you want to create participant you need to pass event ID
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

}

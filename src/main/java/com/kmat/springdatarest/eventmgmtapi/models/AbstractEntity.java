package com.kmat.springdatarest.eventmgmtapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

// parent
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AbstractEntity {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @CreationTimestamp // automatically assigned in the database creation
    @Column(updatable = false)
    protected Instant created;

}

// regarding @MappedSuperclass
// Designates a class whose mapping information is
// applied to the entities that inherit from it.
// A mapped superclass has no separate table defined for it.

// regarding @MappedSuperclass
// tells the JPA provider to include the base class persistent
// properties as if they were declared by the child class extending the superclass
// annotated with

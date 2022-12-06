package com.kmat.springdatarest.eventmgmtapi.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venue extends AbstractEntity {

    private String name;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String country;
    private String postalCode;
}

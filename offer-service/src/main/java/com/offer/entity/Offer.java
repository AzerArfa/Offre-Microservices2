package com.offer.entity;


import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Offer {

	@Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;

    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePublication = new Date();
    
    private Date dateLimiteSoumission;
}

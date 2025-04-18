package com.emsi.controlespring.controlespring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Don {
    @Id
    private int id;
    @ManyToOne
    private Campagne campagne;
    private String nomDonateur;
    private Double montant;
    private Date date;
}

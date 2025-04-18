package com.emsi.controlespring.controlespring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Campagne {
    @Id
    private int id;
    private String nom;
    private Double objectifMontant;
    private Date dateDebut;
    private Date dateFin;

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public Double getObjectifMontant() {
        return objectifMontant;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
}

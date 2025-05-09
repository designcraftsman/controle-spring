package com.emsi.controlespring.controlespring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
public class Campagne {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getObjectifMontant() {
        return objectifMontant;
    }

    public void setObjectifMontant(BigDecimal objectifMontant) {
        this.objectifMontant = objectifMontant;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Id @GeneratedValue
    private Long id;
    private String nom;
    private BigDecimal objectifMontant;
    private LocalDate dateDebut;
    private LocalDate dateFin;

}


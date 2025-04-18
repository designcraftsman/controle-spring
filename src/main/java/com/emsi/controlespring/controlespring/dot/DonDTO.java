package com.emsi.controlespring.controlespring.dot;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DonDTO {
    private Long id;
    @NotBlank
    private String nomCampagne;
    private String nomDonateur;
    @DecimalMin(value="0.01")
    private BigDecimal montant;
    @NotNull
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCampagne() {
        return nomCampagne;
    }

    public void setNomCampagne(String nomCampagne) {
        this.nomCampagne = nomCampagne;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

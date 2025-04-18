package com.emsi.controlespring.controlespring.service;

import com.emsi.controlespring.controlespring.dot.DonDTO;
import com.emsi.controlespring.controlespring.model.Campagne;
import com.emsi.controlespring.controlespring.model.Don;
import com.emsi.controlespring.controlespring.repository.DonationJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emsi.controlespring.controlespring.repository.CampagneJPA;

import java.time.LocalDate;

@Service
public class ServiceDon {

    @Autowired
    private DonationJPA donRepo;

    @Autowired
    private CampagneJPA campagneRepo;

    public DonDTO enregistrerDon(Long idCampagne, DonDTO donDTO) {
        Campagne campagne = campagneRepo.findById(idCampagne)
                .orElseThrow(() -> new RuntimeException("Campagne introuvable"));

        Don don = new Don();
        don.setCampagne(campagne);
        don.setNomDonateur(donDTO.getNomDonateur());
        don.setMontant(donDTO.getMontant());
        don.setDate(LocalDate.now());

        Don savedDon = donRepo.save(don);

        donDTO.setId(savedDon.getId());
        donDTO.setNomCampagne(campagne.getNom());
        donDTO.setDate(savedDon.getDate());

        return donDTO;
    }
}


package com.emsi.controlespring.controlespring.service;

import com.emsi.controlespring.controlespring.projection.CampagneResume;
import com.emsi.controlespring.controlespring.repository.CampagneJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceCampagne {

    @Autowired
    private CampagneJPA campagneRepo;

    public List<CampagneResume> getCampagnesActives() {
        return campagneRepo.findByDateFinAfter(LocalDate.now());
    }
}

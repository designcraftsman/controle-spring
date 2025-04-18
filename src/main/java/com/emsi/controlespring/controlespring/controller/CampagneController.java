package com.emsi.controlespring.controlespring.controller;

import com.emsi.controlespring.controlespring.projection.CampagneResume;
import com.emsi.controlespring.controlespring.service.ServiceCampagne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
public class CampagneController {

    @Autowired
    private ServiceCampagne serviceCampagne;

    @GetMapping("/actives")
    public List<CampagneResume> getCampagnesActives() {
        return serviceCampagne.getCampagnesActives();
    }
}


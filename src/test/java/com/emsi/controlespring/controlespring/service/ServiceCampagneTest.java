package com.emsi.controlespring.controlespring.service;

import com.emsi.controlespring.controlespring.projection.CampagneResume;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ServiceCampagneTest {

    @Autowired
    private ServiceCampagne serviceCampagne;

    @Test
    public void testGetCampagnesActives() {
        List<CampagneResume> actives = serviceCampagne.getCampagnesActives();
        assertNotNull(actives);
    }
}


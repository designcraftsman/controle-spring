package com.emsi.controlespring.controlespring.repository;
import com.emsi.controlespring.controlespring.model.Campagne;
import com.emsi.controlespring.controlespring.projection.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CampagneJPA extends JpaRepository<Campagne, Long> {
    List<CampagneResume> findByDateFinAfter(LocalDate today);
}

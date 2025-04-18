package com.emsi.controlespring.controlespring.controller;


import com.emsi.controlespring.controlespring.dot.DonDTO;
import com.emsi.controlespring.controlespring.service.ServiceDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/campagnes")
public class DonController {

    @Autowired
    private ServiceDon serviceDon;

    @PostMapping("/{id}/dons")
    public ResponseEntity<DonDTO> enregistrerDon(@PathVariable Long id,  @RequestBody DonDTO donDTO) {
        DonDTO saved = serviceDon.enregistrerDon(id, donDTO);
        return ResponseEntity.ok(saved);
    }
}

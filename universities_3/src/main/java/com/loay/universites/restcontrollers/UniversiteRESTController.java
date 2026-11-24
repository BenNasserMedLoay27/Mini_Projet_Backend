package com.loay.universites.restcontrollers;

import com.loay.universites.entities.Universite;
import com.loay.universites.service.UniversiteService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UniversiteRESTController {
    private final UniversiteService universiteService;

    public UniversiteRESTController(UniversiteService universiteService) {
        this.universiteService = universiteService;
    }

    @GetMapping
    public List<Universite> getAllUniversites() { return universiteService.getAllUniversites(); }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) { return universiteService.getUniversite(id); }

    @PostMapping
    public Universite createUniversite(@RequestBody Universite universite) { return universiteService.saveUniversite(universite); }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite universite) { return universiteService.updateUniversite(universite); }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) { universiteService.deleteUniversiteById(id); }

    @GetMapping("/prodscat/{idSysteme}")
    public List<Universite> getUniversitesBySystemeId(@PathVariable Long idSysteme) {
        return universiteService.findBySystemeIdSysteme(idSysteme);
    }
}

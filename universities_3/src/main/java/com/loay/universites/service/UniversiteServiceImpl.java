package com.loay.universites.service;

import com.loay.universites.entities.Systeme;
import com.loay.universites.entities.Universite;
import com.loay.universites.repos.SystemeRepository;
import com.loay.universites.repos.UniversiteRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UniversiteServiceImpl implements UniversiteService {
    private final UniversiteRepository universiteRepository;
    private final SystemeRepository systemeRepository;

    public UniversiteServiceImpl(UniversiteRepository universiteRepository, SystemeRepository systemeRepository) {
        this.universiteRepository = universiteRepository;
        this.systemeRepository = systemeRepository;
    }

    private Universite rattacherSysteme(Universite universite) {
        if (universite.getSysteme() != null && universite.getSysteme().getIdSysteme() != null) {
            Systeme systeme = systemeRepository.findById(universite.getSysteme().getIdSysteme()).orElse(null);
            universite.setSysteme(systeme);
        }
        return universite;
    }

    @Override public Universite saveUniversite(Universite u) { return universiteRepository.save(rattacherSysteme(u)); }
    @Override public Universite updateUniversite(Universite u) { return universiteRepository.save(rattacherSysteme(u)); }
    @Override public void deleteUniversite(Universite u) { universiteRepository.delete(u); }
    @Override public void deleteUniversiteById(Long id) { universiteRepository.deleteById(id); }
    @Override public Universite getUniversite(Long id) { return universiteRepository.findById(id).orElse(null); }
    @Override public List<Universite> getAllUniversites() { return universiteRepository.findAll(); }
    @Override public List<Universite> findByNomUniversite(String nom) { return universiteRepository.findByNomUniversite(nom); }
    @Override public List<Universite> findByNomUniversiteContains(String nom) { return universiteRepository.findByNomUniversiteContains(nom); }
    @Override public List<Universite> findByNomPrix(String nom, Double prix) { return universiteRepository.findByNomPrix(nom, prix); }
    @Override public List<Universite> findBySysteme(Systeme systeme) { return universiteRepository.findBySysteme(systeme); }
    @Override public List<Universite> findBySystemeIdSysteme(Long id) { return universiteRepository.findBySystemeIdSysteme(id); }
    @Override public List<Universite> findByOrderByNomUniversiteAsc() { return universiteRepository.findByOrderByNomUniversiteAsc(); }
    @Override public List<Universite> trierUniversitesNomsPrix() { return universiteRepository.trierUniversitesNomsPrix(); }
}

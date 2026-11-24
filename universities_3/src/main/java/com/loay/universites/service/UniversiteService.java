package com.loay.universites.service;

import com.loay.universites.entities.Systeme;
import com.loay.universites.entities.Universite;
import java.util.List;

public interface UniversiteService {
    Universite saveUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Universite universite);
    void deleteUniversiteById(Long id);
    Universite getUniversite(Long id);
    List<Universite> getAllUniversites();
    List<Universite> findByNomUniversite(String nom);
    List<Universite> findByNomUniversiteContains(String nom);
    List<Universite> findByNomPrix(String nom, Double prix);
    List<Universite> findBySysteme(Systeme systeme);
    List<Universite> findBySystemeIdSysteme(Long id);
    List<Universite> findByOrderByNomUniversiteAsc();
    List<Universite> trierUniversitesNomsPrix();
}

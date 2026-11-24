package com.loay.universites.repos;

import com.loay.universites.entities.Systeme;
import com.loay.universites.entities.Universite;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.Query;

@RepositoryRestResource(path = "rest")
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    List<Universite> findByNomUniversite(String nom);
    List<Universite> findByNomUniversiteContains(String nom);

    @Query("select u from Universite u where u.nomUniversite like %?1 and u.prixUniversite > ?2")
    List<Universite> findByNomPrix(String nom, Double prix);

    @Query("select u from Universite u where u.systeme = ?1")
    List<Universite> findBySysteme(Systeme systeme);

    List<Universite> findBySystemeIdSysteme(Long id);
    List<Universite> findByOrderByNomUniversiteAsc();

    @Query("select u from Universite u order by u.nomUniversite ASC, u.prixUniversite DESC")
    List<Universite> trierUniversitesNomsPrix();
}

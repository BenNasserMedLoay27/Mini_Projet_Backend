package com.loay.universites.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private Double prixUniversite;
    private LocalDate dateCreation;

    @ManyToOne
    private Systeme systeme;

    public Universite() {}
    public Long getIdUniversite() { return idUniversite; }
    public void setIdUniversite(Long idUniversite) { this.idUniversite = idUniversite; }
    public String getNomUniversite() { return nomUniversite; }
    public void setNomUniversite(String nomUniversite) { this.nomUniversite = nomUniversite; }
    public Double getPrixUniversite() { return prixUniversite; }
    public void setPrixUniversite(Double prixUniversite) { this.prixUniversite = prixUniversite; }
    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }
    public Systeme getSysteme() { return systeme; }
    public void setSysteme(Systeme systeme) { this.systeme = systeme; }
}

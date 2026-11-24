package com.loay.universites.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Systeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSysteme;
    private String nomSysteme;

    @JsonIgnore
    @OneToMany(mappedBy = "systeme")
    private List<Universite> universites;

    public Systeme() {}
    public Long getIdSysteme() { return idSysteme; }
    public void setIdSysteme(Long idSysteme) { this.idSysteme = idSysteme; }
    public String getNomSysteme() { return nomSysteme; }
    public void setNomSysteme(String nomSysteme) { this.nomSysteme = nomSysteme; }
    public List<Universite> getUniversites() { return universites; }
    public void setUniversites(List<Universite> universites) { this.universites = universites; }
}

package com.loay.universites.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomUniversite", types = { Universite.class })
public interface UniversiteProjection {
    String getNomUniversite();
}

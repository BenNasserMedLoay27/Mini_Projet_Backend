package com.loay.universites.repos;

import com.loay.universites.entities.Systeme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "systemes-rest")
public interface SystemeRepository extends JpaRepository<Systeme, Long> {}

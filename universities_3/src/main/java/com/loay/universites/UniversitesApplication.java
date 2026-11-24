package com.loay.universites;

import com.loay.universites.entities.Systeme;
import com.loay.universites.entities.Universite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class UniversitesApplication implements CommandLineRunner {
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(UniversitesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repositoryRestConfiguration.exposeIdsFor(Universite.class, Systeme.class);
    }
}

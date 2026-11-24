package com.loay.universites.restcontrollers;

import com.loay.universites.entities.Systeme;
import com.loay.universites.repos.SystemeRepository;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sys")
@CrossOrigin("*")
public class SystemeRESTController {
    private final SystemeRepository systemeRepository;

    public SystemeRESTController(SystemeRepository systemeRepository) {
        this.systemeRepository = systemeRepository;
    }

    @GetMapping
    public List<Systeme> getAllSystemes() { return systemeRepository.findAll(); }

    @GetMapping("/{id}")
    public Systeme getSystemeById(@PathVariable Long id) {
        return systemeRepository.findById(id).orElse(null);
    }
}

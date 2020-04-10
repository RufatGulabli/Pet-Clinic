package com.petclinic.services;

import com.petclinic.repositories.SpecialtyRepository;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtyService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }
}

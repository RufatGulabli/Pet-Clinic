package com.petclinic.services;

import com.petclinic.repositories.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitService {

    private final VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

}

package com.thedevbridge.service;

import com.thedevbridge.model.Patient;
import com.thedevbridge.repository.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by marcel on 3/24/16.
 */
@Service
public class PatientService {

    @Inject
    private PatientRepository patientRepository;

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }
}

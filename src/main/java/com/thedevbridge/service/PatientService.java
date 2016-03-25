package com.thedevbridge.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.thedevbridge.model.Patient;
import com.thedevbridge.repository.PatientRepository;

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

package com.thedevbridge.service;

import com.thedevbridge.model.Consultation;
import com.thedevbridge.model.Patient;
import com.thedevbridge.repository.ConsultationRepository;
import com.thedevbridge.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by marcel on 3/24/16.
 */
@Service
public class ConsultationService {

    @Inject
    private ConsultationRepository consultationRepository;

    public Consultation save(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    public Page<Consultation> getConsultations(int page) {
    	return consultationRepository.findAll(new PageRequest(page, 2));
    }
}

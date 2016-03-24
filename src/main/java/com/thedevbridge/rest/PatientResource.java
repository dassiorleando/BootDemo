package com.thedevbridge.rest;

import com.thedevbridge.model.Patient;
import com.thedevbridge.service.PatientService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by marcel on 3/24/16.
 */
@RestController
@RequestMapping(name = "/api/patients")
public class PatientResource {

    @Inject
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public Patient savePatient(Patient patient) {
        return patientService.save(patient);
    }
}
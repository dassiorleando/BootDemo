package com.thedevbridge.rest;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thedevbridge.model.Patient;
import com.thedevbridge.service.PatientService;

/**
 * Created by marcel on 3/24/16.
 */
@RestController
@RequestMapping(value = "/api/patients")
public class PatientResource {

    @Inject
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.save(patient);
    }
    
    @RequestMapping(value = "/{page}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Page<Patient> getPatients(@PathVariable int page) {
    	return patientService.getPatients(page);
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
    public Patient updatePatient(@RequestBody Patient patient) {
        return patientService.save(patient);
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
    public void removePatient(@PathVariable String id) {
        patientService.remove(id);
    }
}

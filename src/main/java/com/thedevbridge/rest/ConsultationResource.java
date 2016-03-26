package com.thedevbridge.rest;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thedevbridge.model.Consultation;
import com.thedevbridge.service.ConsultationService;

/**
 * Created by marcel on 3/24/16.
 */
@RestController
@RequestMapping(value = "/api/consultations")
public class ConsultationResource {

    @Inject
    private ConsultationService consultationService;

    @RequestMapping(method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public Consultation saveConsultation(@RequestBody Consultation consultation) {
        return consultationService.save(consultation);
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Page<Consultation> getConsultations(@PathVariable int page) {
    	return consultationService.getConsultations(page);
    }

    @RequestMapping(method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
    public Consultation updateConsultation(@RequestBody Consultation consultation) {
        return consultationService.save(consultation);
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
    public void removeConsultation(@PathVariable String id) {
        consultationService.remove(id);
    }
}

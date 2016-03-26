package com.thedevbridge.rest;

import com.thedevbridge.model.Consultation;
import com.thedevbridge.service.ConsultationService;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

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
}

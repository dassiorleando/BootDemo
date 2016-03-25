package com.thedevbridge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thedevbridge.model.Patient;

/**
 * Created by marcel on 3/24/16.
 */
@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}

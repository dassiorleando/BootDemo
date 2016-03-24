package com.thedevbridge.repository;

import com.thedevbridge.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by marcel on 3/24/16.
 */
@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}

package com.thedevbridge.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by marcel on 3/24/16.
 */
@Getter
@Setter
@ToString
@Document(collection = "CONSULTATION")
public class Consultation implements Serializable{

    @Id
    private String id;
    private String motif;
    private String conclusion;
    @DBRef
    private Patient patient;

}

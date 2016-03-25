package com.thedevbridge.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by marcel on 3/24/16.
 */
@Getter
@Setter
@ToString
@Document(collection = "PATIENT")
public class Patient implements Serializable{

    @Id
    private String id;
    private String name;
    private String adress;
}

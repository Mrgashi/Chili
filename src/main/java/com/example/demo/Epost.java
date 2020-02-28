package com.example.demo;
import javax.validation.constraints.*;

//Denne oppretter epost-objekter
public class Epost {

    @Email
    private String epostValidation;

    public String getEpostValidation() {
        return epostValidation;
    }

    public void setEpostValidation(String epostValidation) {
        this.epostValidation = epostValidation;
    }


    }


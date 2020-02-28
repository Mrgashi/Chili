package com.example.demo;
import javax.persistence.*;
import javax.validation.constraints.*;


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


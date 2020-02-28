package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
public class Email {

   @javax.validation.constraints.Email
    @Id
    private String emailValidation;

    public String getEmailValidation() {
        return emailValidation;
    }

    public void setEmailValidation(String emailValidation) {
        this.emailValidation = emailValidation;
    }


    }


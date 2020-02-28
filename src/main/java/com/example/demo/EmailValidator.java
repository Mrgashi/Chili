package com.example.demo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class EmailValidator implements Validator {



    @Override
    public boolean supports(Class clazz) {
        return Epost.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "Epost", "Fuck you");

//        Email email = (Email) o;
//        if (email.getEmailValidation() == null || email.getEmailValidation().equals("")) {
//            errors.rejectValue("email", "Fuck you");
//        }
    }
}




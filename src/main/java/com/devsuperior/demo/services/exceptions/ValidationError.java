package com.devsuperior.demo.services.exceptions;



import com.devsuperior.demo.controllers.exceptions.FieldMessage;
import com.devsuperior.demo.controllers.exceptions.StandardError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private final List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}

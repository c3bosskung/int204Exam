package com.example.exam.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.xml.validation.Validator;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@RequiredArgsConstructor
public class ErrorResponse {
    private final int status;
    private final String message;
    private final String instance;
    private String stackTrace;
    private List<ValidatorError> errors;

    public void addValidatorError(String field, String message) {
        if(Objects.isNull(errors)) {
            errors = new ArrayList<>();
        }
        errors.add(new ValidatorError(field, message));
    }
    @RequiredArgsConstructor
    @Getter
    public static class ValidatorError {
        private final String field;
        private final String message;
    }
}
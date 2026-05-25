package com.student.studentinfo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)

    public Map<String, String> handleStudentNotFound(
            StudentNotFoundException ex) {

        Map<String, String> error =
                new HashMap<>();

        error.put("message", ex.getMessage());

        return error;
    }
}
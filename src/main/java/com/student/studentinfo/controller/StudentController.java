package com.student.studentinfo.controller;

import com.student.studentinfo.entity.Student;
import com.student.studentinfo.service.StudentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/students")

public class StudentController {

    private final StudentService service;

    public StudentController(
            StudentService service) {

        this.service = service;
    }

    // GET ALL STUDENTS

    @GetMapping

    public List<Student> getAll() {

        return service.getAll();
    }

    // GET STUDENT BY ID

    @GetMapping("/{id}")

    public Student getById(
            @PathVariable String id) {

        return service.getById(id);
    }

    // CREATE STUDENT

    @PostMapping

    public Student save(
            @RequestBody Student student) {

        return service.save(student);
    }

    // UPDATE STUDENT

    @PutMapping("/{id}")

    public Student update(
            @PathVariable String id,

            @RequestBody Student student) {

        return service.update(id, student);
    }

    // DELETE STUDENT

    @DeleteMapping("/{id}")

    public String delete(
            @PathVariable String id) {

        service.delete(id);

        return "Student deleted successfully";
    }
}
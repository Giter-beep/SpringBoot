package com.student.studentinfo.service;

import com.student.studentinfo.entity.Student;
import com.student.studentinfo.exception.StudentNotFoundException;
import com.student.studentinfo.repository.StudentRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    private final StudentRepository repository;

    public StudentService(
            StudentRepository repository) {

        this.repository = repository;
    }

    // GET ALL STUDENTS

    public List<Student> getAll() {

        return repository.findAll();
    }

    // SAVE STUDENT

    public Student save(Student student) {

        return repository.save(student);
    }

    // GET STUDENT BY ID

    public Student getById(String id) {

        return repository.findById(id)

                .orElseThrow(() ->

                        new StudentNotFoundException(
                                "Student not found"));
    }

    // DELETE STUDENT

    public void delete(String id) {

        Student student = getById(id);

        repository.delete(student);
    }

    // UPDATE STUDENT

    public Student update(
            String id,
            Student student) {

        Student existingStudent = getById(id);

        student.setId(existingStudent.getId());

        return repository.save(student);
    }
}
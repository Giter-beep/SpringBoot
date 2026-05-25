package com.student.studentinfo.repository;

import com.student.studentinfo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository
        extends MongoRepository<Student, String> {
}
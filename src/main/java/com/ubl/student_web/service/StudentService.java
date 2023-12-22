package com.ubl.student_web.service;

import java.util.List;
import java.util.Optional;

import com.ubl.student_web.domain.Student;

public interface StudentService {

    List<Student> getStudents();
    Optional<Student> findStudentByNim(final String nim);

    void save(Student student);

    void delete(final String nim);

    void update(final Student student);

}

package com.dongzhih.service;

import com.dongzhih.domain.Student;

import java.util.List;

public interface IStudentService {
    List<Student> testFindAll();
    Integer findStudentByScore(Integer score);

    void saveStudent(Student student);

    void delete(String name);

    void updateStudent(Integer id);

}

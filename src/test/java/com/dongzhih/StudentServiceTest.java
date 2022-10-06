package com.dongzhih;

import com.dongzhih.domain.Student;
import com.dongzhih.mapper.MybatisUtil;
import com.dongzhih.mapper.StudentMapper;
import com.dongzhih.service.IStudentService;
import com.dongzhih.service.impl.StudentServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentServiceTest {
    IStudentService studentService = new StudentServiceImpl();


    @Test
    public void testFindAllStudent(){
        List<Student> studentList = studentService.testFindAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentByScore(){
        Integer studentByScore = studentService.findStudentByScore(80);
        System.out.println(studentByScore);
    }

    @Test
    public void testSaveStudent(){
        Student student = new Student();
        student.setName("heima");
        student.setAge(1);
        student.setSex(1);
        student.setScore(88);
        studentService.saveStudent(student);
    }
    @Test
    public void testDelete(){
        studentService.delete("小吴");
    }

    @Test
    public void testUpdateStudent(){
        studentService.updateStudent(2);
    }

}

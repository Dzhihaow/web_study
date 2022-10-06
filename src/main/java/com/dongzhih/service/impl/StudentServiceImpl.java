package com.dongzhih.service.impl;

import com.dongzhih.domain.Student;
import com.dongzhih.mapper.MybatisUtil;
import com.dongzhih.mapper.StudentMapper;
import com.dongzhih.service.IStudentService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private SqlSession sqlSession = null;

    public void getSqlSession(){
        sqlSession = MybatisUtil.getSqlSession();
    }

    public void commitAndClose(){
        MybatisUtil.commitAndClose(sqlSession);
    }


    public List<Student> testFindAll() {
        getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.findAll();

        commitAndClose();
        return studentList;
    }


    public Integer findStudentByScore(Integer score) {
        getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Integer count = studentMapper.findStudentByScore(score);
        commitAndClose();
        return count;
    }


    public void saveStudent(Student student) {
        getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.saveStudent(student);
        commitAndClose();
    }


    public void delete(String name) {
        getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.delete(name);
        commitAndClose();
    }


    public void updateStudent(Integer id) {
        getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.updateStudent(id);
        commitAndClose();
    }
}

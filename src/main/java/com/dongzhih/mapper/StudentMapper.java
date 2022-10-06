package com.dongzhih.mapper;

import com.dongzhih.domain.Student;

import java.util.List;

public interface StudentMapper {

    /**
     * 获取所有学生列表
     * @return
     */
    List<Student> findAll();

    /**
     * 查找成绩大于80的学生人数
     * @param score
     * @return
     */
    Integer findStudentByScore(Integer score);

    /**
     * 保存学生
     *
     * @param student
     * @return
     */
    void saveStudent(Student student);

    /**
     * 删除指定学生
     * @param name
     */
    void delete(String name);

    /**
     * 修改成绩
     * @param id
     * @return
     */
    void updateStudent(Integer id);
}

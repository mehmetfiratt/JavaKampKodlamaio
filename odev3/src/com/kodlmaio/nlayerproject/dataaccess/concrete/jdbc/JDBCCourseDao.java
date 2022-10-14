package com.kodlmaio.nlayerproject.dataaccess.concrete.jdbc;

import com.kodlmaio.nlayerproject.core.DummyGenerator;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.CourseDao;
import com.kodlmaio.nlayerproject.entities.Course;

import java.util.List;

public class JDBCCourseDao implements CourseDao {
    private final List<Course> courseList;

    public JDBCCourseDao() {
        courseList = DummyGenerator.getDummyCourse();
    }

    @Override
    public void add(Course entity) {
        System.out.println("JDBC ile Kurs Eklendi! :" + entity.getName());
    }

    @Override
    public void delete(Course entity) {
        System.out.println("JDBC ile Kurs Silindi! :" + entity.getName());
        courseList.remove(entity);
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }
}
package com.kodlmaio.nlayerproject.dataaccess.concrete.hibernate;

import com.kodlmaio.nlayerproject.core.DummyGenerator;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.CourseDao;
import com.kodlmaio.nlayerproject.entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao {
    private final List<Course> courseList;

    public HibernateCourseDao() {
        courseList = DummyGenerator.getDummyCourse();
    }

    @Override
    public void add(Course entity) {
        System.out.println("Hibernate ile Kurs Eklendi! :" + entity.getName());
    }

    @Override
    public void delete(Course entity) {
        System.out.println("Hibernate ile Kurs Silindi! :" + entity.getName());
        courseList.remove(entity);
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }
}

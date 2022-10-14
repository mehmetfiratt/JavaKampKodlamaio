package com.kodlmaio.nlayerproject.business.abstracts;

import com.kodlmaio.nlayerproject.entities.Course;

import java.util.List;

public interface CourseService {
    void add(Course entity);
    void delete(Course entity);
    List<Course> getAll();
}

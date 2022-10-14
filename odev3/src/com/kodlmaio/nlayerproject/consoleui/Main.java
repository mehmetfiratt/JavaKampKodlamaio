package com.kodlmaio.nlayerproject.consoleui;

import com.kodlmaio.nlayerproject.business.abstracts.CourseService;
import com.kodlmaio.nlayerproject.business.concrete.CourseManager;
import com.kodlmaio.nlayerproject.core.logging.EmailLogger;
import com.kodlmaio.nlayerproject.dataaccess.concrete.hibernate.HibernateCourseDao;
import com.kodlmaio.nlayerproject.entities.Course;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        CourseService courseService = new CourseManager(new HibernateCourseDao(), new EmailLogger());
        Course course = new Course(123, "java", 10000, LocalDateTime.now());
        courseService.add(course);

    }
}

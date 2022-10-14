package com.kodlmaio.nlayerproject.business.concrete;

import com.kodlmaio.nlayerproject.business.abstracts.CourseService;
import com.kodlmaio.nlayerproject.core.logging.Logger;
import com.kodlmaio.nlayerproject.core.validator.CourseValidator;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.CourseDao;
import com.kodlmaio.nlayerproject.entities.Course;

import java.util.List;
import java.util.Objects;

public class CourseManager implements CourseService {
    private final CourseDao courseDao;
    private final CourseValidator courseValidator;
    private final Logger logger;

    public CourseManager(CourseDao courseDao, Logger logger) {
        this.logger = logger;
        this.courseValidator = new CourseValidator();
        this.courseDao = courseDao;
    }

    @Override
    public void add(Course entity) {
        courseValidator.isEmpty(entity.getName());
        courseValidator.lessThan(entity.getPrice(), 0);
        for (Course course : courseDao.getAll()) {
            if (Objects.equals(course.getName(), entity.getName()))
                throw new RuntimeException("Bu kurs ismi zaten var");

        }
        logger.log(entity.getName());
        courseDao.add(entity);
    }

    @Override
    public void delete(Course entity) {
        courseDao.delete(entity);
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }
}

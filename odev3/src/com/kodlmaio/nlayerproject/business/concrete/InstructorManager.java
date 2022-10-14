package com.kodlmaio.nlayerproject.business.concrete;

import com.kodlmaio.nlayerproject.business.abstracts.InstructorService;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.InstructorDao;
import com.kodlmaio.nlayerproject.entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService {
    private final InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void add(Instructor entity) {
        instructorDao.add(entity);
    }

    @Override
    public void delete(Instructor entity) {
        instructorDao.delete(entity);
    }

    @Override
    public List<Instructor> getAll() {
        return instructorDao.getAll();
    }
}

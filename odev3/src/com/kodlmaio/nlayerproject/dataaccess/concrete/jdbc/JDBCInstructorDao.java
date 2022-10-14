package com.kodlmaio.nlayerproject.dataaccess.concrete.jdbc;

import com.kodlmaio.nlayerproject.core.DummyGenerator;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.InstructorDao;
import com.kodlmaio.nlayerproject.entities.Instructor;

import java.util.List;

public class JDBCInstructorDao implements InstructorDao {
    private final List<Instructor> instructors;

    public JDBCInstructorDao() {
        instructors = DummyGenerator.getDummyInstructors();
    }

    @Override
    public void add(Instructor entity) {
        System.out.println("JDBC ile Eğitmen Eklendi! :" + entity.getFirstName());
    }

    @Override
    public void delete(Instructor entity) {
        System.out.println("JDBC ile Eğtimen Silindi! :" + entity.getFirstName());
    }

    @Override
    public List<Instructor> getAll() {
        return instructors;
    }
}
package com.kodlmaio.nlayerproject.business.abstracts;

import com.kodlmaio.nlayerproject.entities.Instructor;

import java.util.List;

public interface InstructorService {
    void add(Instructor entity);
    void delete(Instructor entity);
    List<Instructor> getAll();
}

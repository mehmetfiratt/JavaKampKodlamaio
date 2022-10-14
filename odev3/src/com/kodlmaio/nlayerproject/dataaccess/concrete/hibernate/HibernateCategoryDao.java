package com.kodlmaio.nlayerproject.dataaccess.concrete.hibernate;

import com.kodlmaio.nlayerproject.core.DummyGenerator;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.CategoryDao;
import com.kodlmaio.nlayerproject.entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    private final List<Category> courseList;

    public HibernateCategoryDao() {
        courseList = DummyGenerator.getDummyCategory();
    }

    @Override
    public void add(Category entity) {
        System.out.println("Hibernate ile Kategori Eklendi! :" + entity.getName());
        courseList.add(entity);
    }

    @Override
    public void delete(Category entity) {
        System.out.println("Hibernate ile Kategori Silindi! :" + entity.getName());
        courseList.remove(entity);
    }

    @Override
    public List<Category> getAll() {
        return courseList;
    }
}

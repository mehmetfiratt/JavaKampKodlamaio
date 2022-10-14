package com.kodlmaio.nlayerproject.business.abstracts;

import com.kodlmaio.nlayerproject.entities.Category;

import java.util.List;

public interface CategoryService {
    void add(Category entity);
    void delete(Category entity);
    List<Category> getAll();
}

package com.kodlmaio.nlayerproject.business.concrete;

import com.kodlmaio.nlayerproject.business.abstracts.CategoryService;
import com.kodlmaio.nlayerproject.dataaccess.abstracts.CategoryDao;
import com.kodlmaio.nlayerproject.entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void add(Category entity) {
        categoryDao.getAll().forEach(category ->
        {
            if (category.getName().equals(entity.getName()))
                throw new RuntimeException("Bu kategori ismi zaten var");
        });
        categoryDao.add(entity);
    }

    @Override
    public void delete(Category entity) {
        categoryDao.delete(entity);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}

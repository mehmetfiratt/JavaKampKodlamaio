package com.kodlmaio.nlayerproject.core;

import java.util.List;

public interface EntityRepository<T> {
    void add(T entity);
    void delete(T entity);
    List<T> getAll();
}

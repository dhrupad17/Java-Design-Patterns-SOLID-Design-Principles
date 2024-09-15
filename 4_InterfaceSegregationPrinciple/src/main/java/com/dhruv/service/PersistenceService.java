package com.dhruv.service;

import com.dhruv.entity.Entity;

import java.util.List;

public interface PersistenceService<T extends Entity> {

    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);

    //Not needed in Order Persistence only for User Persistence
//    public List<T> findByName(String name);

}

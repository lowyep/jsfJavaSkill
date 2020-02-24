package com.example.jsfdemo.repository.impl;


import com.example.jsfdemo.data.AbstractEntity;
import com.example.jsfdemo.repository.CoreCrudRepository;
import java.util.Date;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract  class CoreCrudRepositoryImpl <T extends AbstractEntity> implements CoreCrudRepository<T>{
    
     public abstract Class getManagedClass();
     
     @PersistenceContext
    protected EntityManager em;

   @Override
    public List<T> findAll() {
        return em.createQuery("select n from " + getManagedClass().getSimpleName() + " n").getResultList();
    }

    @Override
    public T findById(Long id) {
        return (T) em.find(getManagedClass(), id);
    }

    @Override
    public void save(T entity) {
        entity.setCreatedDate(new Date());
        entity.setLastModifiedDate(new Date());
        em.persist(entity);
    }

    @Override
    public void delete(Long id) {
        em.remove(findById(id));
    }

    @Override
    public void update(T entity) {
        entity.setLastModifiedDate(new Date());
        em.merge(entity);
    }
    
    
}

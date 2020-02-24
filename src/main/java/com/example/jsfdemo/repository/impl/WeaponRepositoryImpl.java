package com.example.jsfdemo.repository.impl;

import com.example.jsfdemo.data.Weapon;
import com.example.jsfdemo.repository.WeaponRepository;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class WeaponRepositoryImpl extends CoreCrudRepositoryImpl<Weapon> implements WeaponRepository {
    @Override
    public Class getManagedClass() {
        return Weapon.class;
    }

   @Override
    public Weapon findByName(String name) {
        Query query = em.createQuery("select n from " + getManagedClass().getSimpleName() + " n where n.name=:name");
        query.setParameter("name", name);
        return (Weapon) query.getSingleResult();
    }
}
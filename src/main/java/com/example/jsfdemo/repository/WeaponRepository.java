package com.example.jsfdemo.repository;
import com.example.jsfdemo.data.Weapon;


public interface WeaponRepository extends CoreCrudRepository<Weapon> {

     Weapon findByName(String name);
}

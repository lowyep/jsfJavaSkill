package com.example.jsfdemo.repository.impl;

import com.example.jsfdemo.data.Robot;
import com.example.jsfdemo.repository.RobotRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RobotRepositoryImpl extends CoreCrudRepositoryImpl<Robot> implements RobotRepository{
@Override
    public Class getManagedClass() {
        return Robot.class;
    }
}

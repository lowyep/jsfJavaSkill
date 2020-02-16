package com.example.jsfdemo.mbean;

import com.example.jsfdemo.data.Robot;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;

@Named
@ViewScoped
public class RobotManagerMBean {

    public RobotManagerMBean() {
    init();
    }
    

    
 
    

    private List<Robot> robotList;

    @PostConstruct
    private void init() {
        robotList = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            Robot robi = new Robot();
            robi.setId(Long.parseLong(i + ""));
            robi.setName("Droideka" + i);
            robi.setType("T-4000");
            robi.setWeapon("Sodrófa");
            robi.setCreatedDate(new Date());
            robi.setLastModifiedDate(new Date());
            robotList.add(robi);
        }
    }

    public List<Robot> getRobotList() {
        return robotList;
    }

    public void setRobotList(List<Robot> robotList) {
        this.robotList = robotList;
    }
}

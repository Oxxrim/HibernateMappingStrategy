package com.internship.dao;

import com.internship.domain.Developer;

public class DeveloperDAO {

    public void save() {
        Developer developer = new Developer();

        developer.setType("human");
        developer.setKindOfActivity("developer");
        developer.setName("Dima");
        developer.setSalary(2000);

        DAOUtil.save(developer);
    }
}

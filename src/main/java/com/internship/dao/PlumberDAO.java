package com.internship.dao;

import com.internship.domain.Plumber;

public class PlumberDAO {

    public void save(){
        Plumber plumber = new Plumber();

        plumber.setType("human");
        plumber.setKindOfActivity("plumber");
        plumber.setName("Vitya");
        plumber.setSalary(1000);

        DAOUtil.save(plumber);
    }
}

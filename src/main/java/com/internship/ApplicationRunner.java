package com.internship;

import com.internship.dao.DeveloperDAO;
import com.internship.dao.DogDAO;
import com.internship.dao.PlumberDAO;

public class ApplicationRunner {

    public static void main(String[] args) {
        DogDAO dogDAO = new DogDAO();
        dogDAO.save();

        DeveloperDAO developerDAO = new DeveloperDAO();
        developerDAO.save();

        PlumberDAO plumberDAO = new PlumberDAO();
        plumberDAO.save();
    }
}

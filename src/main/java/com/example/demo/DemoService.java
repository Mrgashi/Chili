package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    private ChiliRepositoryWithDataJPA chiliRepositoryWithDataJPA;

    public List<Chili> getDataWithJPA(int scovilleOfChili) {
        List<Chili> chilies = (List<Chili>) chiliRepositoryWithDataJPA.findAll();

        List<Chili> chiliList = new ArrayList<>();

        for(Chili chili : chilies) {
            chiliList.add(chili);
        }
        return chiliList;
    }
}

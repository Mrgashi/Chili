package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    private final ChiliRepositoryWithDataJPA chiliRepositoryWithDataJPA;

    public DemoService(ChiliRepositoryWithDataJPA chiliRepositoryWithDataJPA) {
        this.chiliRepositoryWithDataJPA = chiliRepositoryWithDataJPA;
    }

    public List<Chili> getDataWithJPA(int scovilleOfChili) {
        List<Chili> chilies = (List<Chili>) chiliRepositoryWithDataJPA.findChiliesWithQueryScoville(scovilleOfChili);

        return new ArrayList<>(chilies);
    }
}

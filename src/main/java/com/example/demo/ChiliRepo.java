package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class ChiliRepo {

    List<Chili> chiliList;

    public ChiliRepo() {
        chiliList = new ArrayList<>();

        int listSize = 20;
        for (int i = 0; i < listSize; i++) {
           chiliList.add(new Chili("Habanero" + i, 100, "Gambia", ColorOfChili.RED, i));
            //System.out.println(chiliList.get(i));
        }
    }

    public Chili getChili(Integer id) {
        for (Chili chili : chiliList) {
            if (chili.getId() == id) {
                return chili;
            }
        }
        return null;
    }
     public List<Chili> getPage(){
        return chiliList;
     }

}


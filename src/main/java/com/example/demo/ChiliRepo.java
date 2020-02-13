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

    //***GETPAGE FRA BOOKSTORE, henter ut side med korrekt antall elementer***
    public List<Chili> getChiliSubgroup(int page, int pageSize){
        int from = Math.max(0,page*pageSize);
        int to = Math.min(chiliList.size(), (page +1)*pageSize);

        return chiliList.subList(from,to);
    }

    //Angir ant. sider å paginere over gitt ant. elementer på hver side
    public int numberOfPages (int pageSize){
        return (int) Math.ceil((double) chiliList.size() / pageSize);
    }

    //henter ut chili basert på id
    public Chili getChiliById(Integer id) {
        for (Chili chili : chiliList) {
            if (chili.getId() == id) {
                return chili;
            }
        }
        return null;
    }



    //Henter ut alle chili-elementer
     public List<Chili> getAllChilis(){

        return chiliList;
     }



}




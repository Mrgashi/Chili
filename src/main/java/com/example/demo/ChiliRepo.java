package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class ChiliRepo {

    List<Chili> chiliList;

    public ChiliRepo() {
        chiliList = new ArrayList<>();

        chiliList.add(new Chili("Bell Peppers", 0, "Mexico", ColorOfChili.GREEN, 0, "https://www.chilipeppermadness.com/wp-content/uploads/2019/08/Bell-Peppers.jpg"));
        chiliList.add(new Chili("Banana Pepper", 200, "India", ColorOfChili.YELLOW, 1, "https://www.chilipeppermadness.com/wp-content/uploads/2019/08/Banana-Peppers2.jpg"));
        chiliList.add(new Chili("Pepperoncini Peppers", 350, "Italy", ColorOfChili.YELLOW, 2, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Pepperoncini-Peppers1.jpg"));
        chiliList.add(new Chili("Ananheim Peppers", 600, "USA", ColorOfChili.GREEN, 3, "https://www.chilipeppermadness.com/wp-content/uploads/2019/05/Anaheim-Peppers.jpg"));
        chiliList.add(new Chili("Ancho Pepper", 1000, "Mexico", ColorOfChili.RED, 4, "https://www.chilipeppermadness.com/wp-content/uploads/2013/09/Ancho-Chili-Sauce-Recipe3.jpg"));
        chiliList.add(new Chili("Hungarian Wax Pepper", 3000, "Hungary", ColorOfChili.YELLOW, 5, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Hungarian-Wax-Chili-Peppers-HERO.jpg"));
        chiliList.add(new Chili("Espelette Pepper", 4000, "France", ColorOfChili.RED, 6, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Espelette-Chili-Peppers.jpg"));
        chiliList.add(new Chili("Jalapeno Pepper", 7000, "Mexico", ColorOfChili.GREEN, 7, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Jalapeno-Peppers1.jpg"));
        chiliList.add(new Chili("Serrano Pepper", 12000, "Spain", ColorOfChili.GREEN, 8, "https://www.chilipeppermadness.com/wp-content/uploads/2013/09/Serrano-Peppers1.jpg"));
        chiliList.add(new Chili("Cayenne Pepper", 30000, "Brazil", ColorOfChili.RED, 9, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Carolina-Cayenne.jpg"));
        chiliList.add(new Chili("ChilTepin Pepper", 50000, "USA", ColorOfChili.RED, 10, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Chiltepin-Peppers.jpg"));
        chiliList.add(new Chili("Thai Pepper", 75000, "Thailand", ColorOfChili.RED, 11, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Thai-Peppers.jpg"));
        chiliList.add(new Chili("Datil Pepper", 100000, "Chile", ColorOfChili.YELLOW, 12, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Datil-Peppers.jpg"));
        chiliList.add(new Chili("Habanero Pepper", 250000, "Cuba", ColorOfChili.YELLOW, 13, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Habanero-Peppers1.jpg"));
        chiliList.add(new Chili("Scotch Bonnet Chili Pepper", 350000, "Bahamas", ColorOfChili.ORANGE, 14, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Scotch-Bonnet-Chili-Peppers2.jpg"));
        chiliList.add(new Chili("Ghost Pepper(Bhut Jolokia)", 1000000, "India", ColorOfChili.ORANGE, 15, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Ghost-Peppers1.jpg"));
        chiliList.add(new Chili("Trinidad Scorpion Butch T Pepper", 1200000, "Trinidad and Tobago", ColorOfChili.RED, 16, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Trinidad-Scorpion-Peppers.jpg"));
        chiliList.add(new Chili("Brain Strain Pepper", 1450000, "USA", ColorOfChili.ORANGE, 17, "https://www.chilipeppermadness.com/wp-content/uploads/2018/07/Brain-Strain-Chili-Pepper1.jpg"));
        chiliList.add(new Chili("Komodo Dragon Pepper", 1700000, "United Kingdom", ColorOfChili.RED, 18, "https://www.chilipeppermadness.com/wp-content/uploads/2017/06/Komodo-Dragon-Peppers.jpg"));
        chiliList.add(new Chili("Carolina Reaper", 2200000, "USA", ColorOfChili.RED, 19, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Carolina-Reaper-Pepper.jpg"));
    }


    //***GETPAGE FRA BOOKSTORE, henter ut side med korrekt antall elementer***
    public List<Chili> getChiliSubgroup(int page, int pageSize) {
        int from = Math.max(0, page * pageSize);
        int to = Math.min(chiliList.size(), (page + 1) * pageSize);

        return chiliList.subList(from, to);
    }

    //Angir ant. sider å paginere over gitt ant. elementer på hver side
    public int numberOfPages(int pageSize) {
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

}




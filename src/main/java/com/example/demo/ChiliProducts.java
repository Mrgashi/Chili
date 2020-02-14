package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ChiliProducts extends Chili {

    public ChiliProducts(String nameOfChili, int scovilleOfChili, String originOfChili, ColorOfChili colorOfChili, Integer id, String imageURL) {
        super(nameOfChili, scovilleOfChili, originOfChili, colorOfChili, id, imageURL);
    }

    Chili bellPepper = new Chili("Bell Peppers", 0, "Mexico", ColorOfChili.GREEN, 0, "https://www.chilipeppermadness.com/wp-content/uploads/2019/08/Bell-Peppers.jpg");
    Chili bananaPepper = new Chili("Banana Pepper",200, "India", ColorOfChili.YELLOW, 1, "https://www.chilipeppermadness.com/wp-content/uploads/2019/08/Banana-Peppers2.jpg");
    Chili pepperonciniPepper = new Chili("Pepperoncini Peppers", 350, "Italy", ColorOfChili.YELLOW, 2, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Pepperoncini-Peppers1.jpg");
    Chili anaheimPepper = new Chili("Ananheim Peppers", 600, "USA", ColorOfChili.GREEN, 3, "https://www.chilipeppermadness.com/wp-content/uploads/2019/05/Anaheim-Peppers.jpg");
    Chili anchoPepper = new Chili("Ancho Pepper", 1000, "Mexico", ColorOfChili.RED, 4, "https://www.chilipeppermadness.com/wp-content/uploads/2013/09/Ancho-Chili-Sauce-Recipe3.jpg");
    Chili hungarianWaxPepper = new Chili("Hungarian Wax Pepper",3000,"Hungary",ColorOfChili.YELLOW, 5, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Hungarian-Wax-Chili-Peppers-HERO.jpg");
    Chili espelettePepper = new Chili("Espelette Pepper", 4000, "France", ColorOfChili.RED, 6, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Espelette-Chili-Peppers.jpg");
    Chili jalapenoPepper = new Chili("Jalapeno Pepper", 7000,"Mexico", ColorOfChili.GREEN, 7, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Jalapeno-Peppers1.jpg");
    Chili serranoPepper = new Chili("Serrano Pepper", 12000, "Spain", ColorOfChili.GREEN, 8, "https://www.chilipeppermadness.com/wp-content/uploads/2013/09/Serrano-Peppers1.jpg");
    Chili cayennePepper = new Chili("Cayenne Pepper", 30000, "Brazil", ColorOfChili.RED, 9, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Carolina-Cayenne.jpg");
    Chili chiltepinPepper = new Chili("ChilTepin Pepper", 50000, "USA", ColorOfChili.RED, 10, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Chiltepin-Peppers.jpg");
    Chili thaiPepper = new Chili("Thai Pepper", 75000, "Thailand", ColorOfChili.RED, 11, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Thai-Peppers.jpg");
    Chili datilPepper = new Chili("Datil Pepper", 100000, "Chile", ColorOfChili.YELLOW, 12, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Datil-Peppers.jpg");
    Chili habaneroPepper = new Chili("Habanero Pepper", 250000, "Cuba", ColorOfChili.YELLOW, 13, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Habanero-Peppers1.jpg");
    Chili scotchBonnetChiliPepper = new Chili("Scotch Bonnet Chili Pepper", 350000,"Bahamas", ColorOfChili.ORANGE, 14, "https://www.chilipeppermadness.com/wp-content/uploads/2013/10/Scotch-Bonnet-Chili-Peppers2.jpg");
    Chili ghostPepper = new Chili("Ghost Pepper(Bhut Jolokia", 1000000, "India", ColorOfChili.ORANGE, 15, "https://www.chilipeppermadness.com/wp-content/uploads/2018/10/Ghost-Peppers1.jpg");
    Chili trinidadScorpionButchTPepper = new Chili("Trinidad Scorpion Butch T Pepper", 1200000, "Trinidad and Tobago", ColorOfChili.RED, 16, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Trinidad-Scorpion-Peppers.jpg");
    Chili brainStrainPepper = new Chili("Brain Strain Pepper", 1450000, "USA", ColorOfChili.ORANGE, 17, "https://www.chilipeppermadness.com/wp-content/uploads/2018/07/Brain-Strain-Chili-Pepper1.jpg");
    Chili komodoDragonPepper = new Chili("Komodo Dragon Pepper", 1700000, "United Kingdom", ColorOfChili.RED, 18, "https://www.chilipeppermadness.com/wp-content/uploads/2017/06/Komodo-Dragon-Peppers.jpg");
    Chili carolinaReaper = new Chili("Carolina Reaper", 2200000, "USA", ColorOfChili.RED, 19, "https://www.chilipeppermadness.com/wp-content/uploads/2019/04/Carolina-Reaper-Pepper.jpg");
}




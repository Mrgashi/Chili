package com.example.demo;

public class MethodsForTest {

    public static String spicierChili(Chili chiliOne, Chili chiliTwo) {
        if (chiliOne.getScovilleOfChili() > chiliTwo.getScovilleOfChili()) {
            return chiliOne.getNameOfChili() + " is spicier than " + chiliTwo.getNameOfChili();
        }
        return chiliTwo.getNameOfChili() + " is spicier than " + chiliOne.getNameOfChili();
    }
}

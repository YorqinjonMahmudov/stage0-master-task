package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {

        if (monthNumber<1)
            System.out.println("Wrong month number");
        else if (monthNumber <= 2  || monthNumber == 12)
            System.out.println("Winter");
        else if (monthNumber < 6)
            System.out.println("Spring");
        else if (monthNumber < 9)
            System.out.println("Summer");
        else if (monthNumber < 12)
            System.out.println("Autumn");
        else
            System.out.println("Wrong month number");

    }

}

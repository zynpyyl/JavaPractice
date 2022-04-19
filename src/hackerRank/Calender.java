package hackerRank;

import java.time.LocalDate;

public class Calender {
    public static void main(String[] args) {

        String s=LocalDate.of(2022,03,16).getDayOfWeek().name();
        System.out.println(s);


    }
}

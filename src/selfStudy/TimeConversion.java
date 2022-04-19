package selfStudy;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());


    }

    public static void timeConversion(String s) {
        if (s.endsWith("AM")) {
            System.out.println(s.substring(0, s.length() - 2));
        } else {
            s=s.replace(s.substring(0,2),Integer.valueOf(s.substring(0,2))+12+"");
            System.out.println(s);
        }
    }
}
//Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//The timeConversion method should convert and print the given number (String argument)
//Input: 07:05:45PM
//Output: 19:05:45
//Input: 07:15:55AM
//Output: 07:15:55
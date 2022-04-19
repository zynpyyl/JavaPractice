package selfStudy;
import java.util.*;
public class TimeConversion2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {
            /*
             * Write your code here.
             */

            s = s.trim();
            String result = s.substring(0, s.length() - 2);
            int index0 = s.charAt(0) - '0', index1 = s.charAt(1) - '0';


            if (s.endsWith("AM") && s.startsWith("12")) {
                result = "00" + s.substring(2, s.length() - 2);
            }

            if (s.endsWith("PM")&& !s.startsWith("12")) {
                result = "" + (index0 + 1) + (index1 + 2) + s.substring(2, s.length() - 2);
            }

            System.out.println(result);
        }
    }


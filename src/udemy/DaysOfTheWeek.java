package udemy;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(3);
    }
    public static void printDayOfTheWeek(int day){
        String result="";
        switch (day){
            case 1:
                result="Sunday";
                break;
            case 2:
                result="Monday";
                break;
            case 3:
                result="Tuesday";
                break;
            case 4:
                result="Wednesday";
                break;
            case 5:
                result="Thursday";
                break;
            case 6:
                result="Friday";
                break;
            case 7:
                result="Saturday";
                break;
            default:
                result="Invalid day";
                break;

        }
        System.out.println(result);

    }
}

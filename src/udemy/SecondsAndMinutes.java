package udemy;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(-1,59);
        getDurationString(420);
    }

    public static void getDurationString(int minutes,int seconds){
        if(!(minutes>=0&&seconds>=0&&seconds<=59)) {
            System.out.println("Invalid value");
        }else{
        int hours=minutes/60;
        int remainder=minutes%60;
        String strHours= (hours<10)? "0"+hours : hours+"";
        String strMinutes= (remainder<10)? "0"+remainder : remainder+"";
        String strSeconds=(seconds<10)? "0"+seconds : seconds+"";
        System.out.println(strHours+"h "+strMinutes+"m "+strMinutes+"s");
        }}
    public static void getDurationString(int seconds){
        if(seconds<0) {
            System.out.println("Invalid value");
        }else{
        int minutes=seconds/60;
        int remainder=seconds%60;
        getDurationString(minutes,remainder);
    }}
    }


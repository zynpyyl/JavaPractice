package udemy;

public class Lesson58 {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, -1));

        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(!(feet>=0&&inches>=0&&inches<=12)) {
            return -1;
        }
            return (feet*12+inches)*2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
            int feet=(int) inches/12;
            double remainder=inches%12;
            return calcFeetAndInchesToCentimeters(feet,remainder);

    }
}

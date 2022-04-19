package udemy;

public class EqualByThreeDecimals {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        int n1=(int) (num1*1000);
        int n2=(int) (num2*1000);
        return(n1==n2);

    }
}

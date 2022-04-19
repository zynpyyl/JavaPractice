package udemy;

public class FirstAndlastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;

        if(number<10)
            return number*2;

        int lastDigit=number%10;
        while(number>1){
            if(number/10<1)
                break;

            number=number/10;

        }
        return number+lastDigit;
    }
}

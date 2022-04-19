package udemy;

public class EvenDigitSum {

    public static void main(String[] args) {
        int num=getEvenDigitSum(456723);
        System.out.println(num);
    }

    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;

        String str=number+"";
        int sum=0;
        for ( char each : str.toCharArray() ){
            if((each-48)%2==0)
                sum+=(each-48);

        }
        return sum;
    }
}

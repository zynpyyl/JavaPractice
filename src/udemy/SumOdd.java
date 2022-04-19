package udemy;

public class SumOdd {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        int sum=0;
        int count=0;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {
                count++;
                sum++;
                System.out.println("Even number " + number);
                if(count==5)
                    break;

            }
        }
        System.out.println("number of even numbers: "+ count);
        System.out.println("sum of even numbers: "+sum);

    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0)
            return true;

        return false;
    }










}

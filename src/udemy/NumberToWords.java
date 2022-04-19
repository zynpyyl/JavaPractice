package udemy;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(5));
        int n=reverse(-2);
        System.out.println(n);
        numberToWords(0);

    }
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        if(number==0)
            System.out.println("Zero");
        int reversedNumber = reverse(number);
        int numOfZeros = getDigitCount(number) - getDigitCount(reverse(number));
        String word1 = "";
        String result = "";

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0:
                    word1 = "Zero";
                    break;
                case 1:
                    word1 = "One";
                    break;
                case 2:
                    word1 = "Two";
                    break;
                case 3:
                    word1 = "Three";
                    break;
                case 4:
                    word1 = "Four";
                    break;
                case 5:
                    word1 = "Five";
                    break;
                case 6:
                    word1 = "Six";
                    break;
                case 7:
                    word1 = "Seven";
                    break;
                case 8:
                    word1 = "Eight";
                    break;
                case 9:
                    word1 = "Nine";
                    break;
                default:
                    word1 = "Invalid";
            }
            result += word1 + " ";
            reversedNumber /= 10;
        }
        for (int i = 0; i < numOfZeros; i++) {
            result+="Zero"+" ";
        }System.out.println(result);
    }

    public static int reverse(int num){
        int t=num;
        if(num<0) t =num*-1;
        int reverse=0;
        while(t>0){
            reverse+=t%10; // find the last digit
            t/=10;         // ignore the last digit
            if(t<1)        // reached the first digit you will make it the last digit no need to enlarge
                continue;
            reverse*=10;     // enlarge the reverse number to add the next digit
        }

        return (num<0)? reverse*-1 : reverse;

    }
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        if(number==0)
            return 1;

        int digits=1;
        while(number>0){
            number/=10;
            digits++;
        }
            return digits;
    }
}

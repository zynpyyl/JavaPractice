package udemy;

public class PalindromeNumbers {
    public static void main(String[] args) {

        int n=12321;
        boolean b1=isPalindrome(n);
        System.out.println(b1);
    }

    public static boolean isPalindrome(int number){

        if(number<0)  number*=-1;

        int temp=number;
        int reverse = 0;
        while (temp > 0) {
            reverse += temp%10;
            if(temp<10)
                break;
            reverse*=10;
            temp /= 10;
        }
        return reverse==number;
    }


}

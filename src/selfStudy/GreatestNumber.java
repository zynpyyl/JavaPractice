package selfStudy;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 different numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        String result =(num1 > num2 && num1 > num3) ? num1 + " is the gratest number" : (num2 > num1 && num2 > num3) ?
                num2 + " is the greatest number" : num3 + " is the greatest number";
        System.out.println(result);
    }}

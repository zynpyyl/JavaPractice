import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number :");
        int num1 = input.nextInt();
        System.out.println("Input second number :");
        int num2 = input.nextInt();
        System.out.println("Input third number :");
        int num3 = input.nextInt();
        if (num1!=num2 || num2!=num3){
            if (num1>num2 && num1>num3){
                System.out.println("The biggest number is "+num1);
            }else if ((num2>num1 && num2>num3)){
                System.out.println("The biggest number is "+num2);
            }else {
                System.out.println("The biggest number is "+num3);
            }
        }else {
            System.out.println("They are equal numbers");
        }
    }
}

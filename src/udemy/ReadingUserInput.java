package udemy;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count=1;

        while (count<=10){
            System.out.println("Enter number " + count + ":");
            if (scan.hasNextInt()){
                int num = scan.nextInt();
                sum += num;
                count++;
            }else{
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("sum = " + sum);
        scan.close();

    }
}

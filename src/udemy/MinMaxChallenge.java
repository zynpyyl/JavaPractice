package udemy;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while (true){
            System.out.println("Enter a number:");
            if(scan.hasNextInt()){
                int num= scan.nextInt();
                if(num>max)
                    max=num;
                if(num<min)
                    min=num;
            }else{
                break;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scan.close();
    }

}

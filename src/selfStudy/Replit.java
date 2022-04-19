package selfStudy;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                String[] arr = new String[5];
                for (int i=0;i<5;i++)
                {
                    arr[i] = input.nextLine();
                }
                //leave above alone!  write your code below.
                //Create another loop for your solution!
                for( String each : arr){
                    System.out.println(each.substring(0,3));
                }



            }
        }


package patterns;

import java.util.Scanner;

public class Butterfly {


            public static void main(String[] args) {
                int p;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number of rows:");
                p = scan.nextInt();

                for (int i = 1; i <= p; i++) {
                    for (int j = 1; j <= p - i; j++) {

                        System.out.print(" ");

                    }
                    for (int c = 1; c <= i; c++) {
                        System.out.print("* ");
                    }
                    for (int t = 1; t <= p - i-1; t++) {
                        System.out.print("  ");
                    }
                    for (int r = 1; r <= i; r++) {

                        if(p==i && r==i)
                            break;

                        System.out.print("* ");

                    }
                    System.out.println();
                }

            }
        }

        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = i*2; j < 5*2-2 ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i; j <4 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i*2+2 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 4 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }





    }
}*/

package hackerRank;

import java.util.Scanner;

public class JavaLoops2 {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();


                int result=a;
                for (int j=1; j<=n ; j++) {
                    result+=(Math.pow(2,i-1))*b;
                    System.out.print(result+" ");
                }

                System.out.println();
            }
            in.close();





        }
    }


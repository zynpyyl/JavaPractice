package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int day=0;
        while(true){
            int sum=0;
            System.out.println("Day "+day++ +" "+Arrays.toString(inhabitants));

            for(int i=0;i<inhabitants.length;i++){
                inhabitants[i]/=2;
                sum+=inhabitants[i];
            }
            if(sum==0){
                System.out.println("Day "+day++ +" "+Arrays.toString(inhabitants)+"\n-----------EXTINCT-----------" );
                break;
        }
    }
}}
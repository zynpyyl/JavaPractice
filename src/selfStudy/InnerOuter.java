package selfStudy;

import java.util.*;

public class InnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        if(sizeInner>sizeOuter){
            System.err.println("inner array can not be longer than outer array");
            System.exit(0);
        }
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int count=0;
        for( int in: inner){
            for ( int out : outer){
                if(in==out){
                    count++;
                    break;
                }
            }}
        System.out.println((count==sizeInner)? true : false);
    }
}
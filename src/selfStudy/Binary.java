package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
        public static void main(String[] args) {
            int num=35;
            int[] binary=new int[8];


            for (int i = 1,j=binary.length-1; i < 256; i*=2,j--) {
                int remainder=0;
                remainder=(num/i)%2;
                binary[j]=remainder;
        }
            System.out.println(Arrays.toString(binary));
        }
        }


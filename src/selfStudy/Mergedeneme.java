package selfStudy;

import java.util.Arrays;

public class Mergedeneme {
    public static void main(String[] args) {

        int num1[] = {1, 9, 7, 8};
        int num2[] = {2, 5, 3};
        int num3[] = new int[num1.length + num2.length];

        for (int i = 0, j = 0; i < num1.length ; i++, j++) {
            num3[i] = num1[i];
            if(i==3)
                break;
            num3[num1.length + j] = num2[j];
        }


        System.out.println(Arrays.toString(num3));
    }
}
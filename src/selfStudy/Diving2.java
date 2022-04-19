package selfStudy;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Diving2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            float[] score = new float[7];
            float min = 10, max = 0, sum = 0;
            for (int i = 0; i < score.length; i++) {
                System.out.println("Enter score for judge " + (i + 1) + ":");
                score[i] = scan.nextFloat();
                if (score[i] > max) max = score[i];
                if (score[i] < min) min = score[i];
            }
            for (int i = 0; i <score.length; i++) {
                if(score[i]!=max&&score[i]!=min)
                    sum+=score[i];
            }

            System.out.println("Enter difficulty:");
            float dif = scan.nextFloat();
            System.out.printf("Total: %.2f", (sum * dif * 0.6));
        }
    }


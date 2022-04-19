package selfStudy;

import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for(int i=1;i<=score.length;i++){
            System.out.println("Enter score for judge "+i+":");
            score[i-1]=input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty=input.nextFloat();
        
                float min=score[0];
                for( float each : score){
                    if(each<min)
                        min=each;
                }
                float max=score[0];
                for( float each : score){
                    if(each>max)
                        max=each;
                }
                float total=0;
                for( float each : score){
                    if(each!=min&&each!=max)
                        total+=each;
                }

                total*=difficulty*0.6;


                // FINAL OUTPUT
                System.out.printf("Total: %.2f", total);
            }
        }

package selfStudy;
import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] arr=new int[10];
        arr[0]=arr[arr.length-1]= Integer.MAX_VALUE;
        int days=0;
        System.out.println("Day 0 "+ Arrays.toString(inhabitants));
        while(true) {
            for (int i = 0; i < inhabitants.length; i++) {
                arr[i + 1] = inhabitants[i];
            }int sum=0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (arr[i] == 0 || arr[i + 2] == 0)
                    inhabitants[i] /= 2;
            }
            System.out.println("Day "+ ++days+" "+Arrays.toString(inhabitants));
            for(int each: inhabitants)
                sum+=each;
            if(sum==0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}








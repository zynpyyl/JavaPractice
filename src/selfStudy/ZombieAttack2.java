package selfStudy;
import java.util.Arrays;
import java.util.Scanner;
public class ZombieAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        System.out.println("Day 0 "+Arrays.toString(arr));
        int l=arr.length;
        int day=0;
        while(true) {
            int sum=0;
            for (int i = 0; i < l - 1; i++) {
                if (arr[i] == 0)
                    arr[i + 1] /= 2;
                if (arr[l - i - 1] == 0)
                    arr[l - i - 2] /= 2;
            }
            for (int each : arr) {
                sum+=each;
            }
            System.out.println("Day "+ ++day +" "+Arrays.toString(arr));
            if(sum==0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }



    }
}
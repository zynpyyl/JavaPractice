package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            String[] arr=str.split(",");

            int min=arr[0].length();
            String output="";
            for (String each : arr ){
                if(each.length()<min)
                    min=each.length();
            }

            for( String each :arr){
                if(each.length()==min)
                    output+=each+" ";
            }

            String[]arr2=output.split(" ");
            System.out.println(Arrays.toString(arr2));

    }
}

package selfStudy;

import java.util.Arrays;

public class RemoveZeros {
    public static void main(String[] args) {


            int nums[]={2,5,0,6,4,0,9};
            int nnums[]=new int[nums.length];

            for (int i = 0,j=0; i < nums.length; i++) {

                if(nums[i]!=0){
                    nnums[j]=nums[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(nnums));

        }
    }



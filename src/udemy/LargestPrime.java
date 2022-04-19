package udemy;


public class LargestPrime {
    public static void main(String[] args) {
        int i=getLargestPrime(21);
        System.out.println(i);

    }


    public static int getLargestPrime(int number) {
        if (number <= 0)
            return -1;

        for (int i = number; i > 1; i--) {
            int count=0;
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if(count==1)
                    return i;
            }
        }
        return -1;
    }
}
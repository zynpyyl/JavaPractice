package udemy;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int n=largestPrimeFactor(7);
        System.out.println(n);
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }
}

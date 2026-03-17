public class NumberSolver{
    public static void printFactorCount(int k) {
        for (int i = 1; i <= k; i++) {
            int count = 0;

            // count factors of i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    public static void printSumOfFactors(int k) {
        for (int i = 1; i <= k; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int k = 10; // You can change this value to test with different numbers
        //printFactorCount(k);
        printSumOfFactors(k);
    }
}
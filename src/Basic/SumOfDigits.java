package Basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= 2 * n - 1; i += 2) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += fact;
        }

        System.out.println("Result = " + sum);
    }
}

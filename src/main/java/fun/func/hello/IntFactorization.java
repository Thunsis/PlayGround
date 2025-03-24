package fun.func.hello;

import java.util.Scanner;

public class IntFactorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number /10;
        } while (number > 0);
        System.out.println(reversedNumber);
    }
}

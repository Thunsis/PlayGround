package fun.func.howAreYou;

import java.util.Scanner;

public class IsPrime {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        // 前n个素数
        int[] primes = new int[50];
        primes[0] = 2;
        int cnt = 1;
        MAIN_LOOP:
        for (int x = 3; cnt < 50; x++) {
            for (int i = 0; i < cnt; i++) {
                if (x % primes[i] == 0)
                {
                    continue MAIN_LOOP;
                }
            }
            primes[cnt++] = x;
        }
        for (int k:primes) {
            System.out.print(k + " ");
        }
        // n以内的素数
        System.out.println("\n请输入你想求多少以内（不含）的素数：");
        int n = in.nextInt();
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        MAIN_LOOP:
        for (int x = 2; x < isPrime.length; x++) {
            if (isPrime[x]) {
                for (int i = 2; x*i < isPrime.length; i++) {
                    isPrime[x*i] = false;
                }
            }
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }

}

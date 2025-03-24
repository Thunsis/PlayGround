package fun.func.hello;

import java.util.Scanner;

public class GCD {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        // 暴力枚举法
        int gcd = 1;
        for (int i=2; i<=a&&i<=b; i++) {
            if (a%i==0&&b%i==0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
        // 辗转相除法
        int oa = a;
        int ob = b;
        while (b!=0) {
            int r = a % b;
            System.out.println(a+","+b+","+r);
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}

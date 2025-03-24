package fun.func.hello;

import java.util.Scanner;

public class Rocket {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 100;
        // 可以通过一个模拟一个比较小的循环来判断大的循环的循环次数
        while (count > 0) {
            System.out.println(count);
            count = count - 1;
        }
        System.out.println(count);
        System.out.println("🚀");

        count = 100;
        do {
            System.out.println(count);
            count = count - 1;
        } while (count > 0);
        System.out.println(count);
        System.out.println("🚀");

        // 当第一次循环能满足条件时，while和do while的循环次数一样
    }
}

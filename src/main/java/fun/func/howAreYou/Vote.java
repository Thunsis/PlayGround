package fun.func.howAreYou;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // 每个元素默认是0
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+"有"+numbers[i]+"个;");
        }
        while (x!=-1) {
            if (x>=0&&x<=9) {
                numbers[x] ++;
            }
            x = in.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+"有"+numbers[i]+"个;");
        }
    }
}

package fun.func.howAreYou;

import java.util.Scanner;

public class Swap {
    public static void swap (int a, int b) // a, b 是参数
    {
        int t = a;
        a = b;
        b = t;
        System.out.println("in swap: a=" + a + ",b=" + b);
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = in.nextInt();
        int b = in.nextInt();
        // 调用函数只能传值给函数
        swap(a, b); // a, b 是值
        System.out.println("out of swap: a=" + a + ",b=" + b);
    }
}

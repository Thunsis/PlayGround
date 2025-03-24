package fun.func.hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("你好");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo:" + in.nextLine());
        int amount = 100;
        int price = 0;
        System.out.print("请输入票面：");
        amount = in.nextInt();
        System.out.print("请输入金额：");
        price = in.nextInt();
        // (amount-price)根据调整计算优先级达到计算的目的而不是被拼接到前面的字符串
        System.out.println(amount+"-"+price+"="+(amount-price));
    }
}

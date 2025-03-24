package fun.func.hello;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {

        // 初始化
        Scanner in = new Scanner(System.in);
        int balance = 0;
        while (true) {
            // 读入投币金额
            System.out.print("请投币：");
            int amount = in.nextInt();
            balance = balance + amount;
            if (balance >= 10)
            {
                // 打印车票
                System.out.println("***************");
                System.out.println("* Java城际铁路 *");
                System.out.println("*  无指定座位   *");
                System.out.println("*  票价：10元  *");
                System.out.println("***************");

                // 计算并打印找零
                System.out.println("找零：" + (balance - 10));
                balance = 0;
            }
        }
    }
}


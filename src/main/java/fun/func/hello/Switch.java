package fun.func.hello;

import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        // 程序会进入对应的case语句内执行，继续往下到其他case语句一直执行，直到遇到break才会跳出switch语句
        switch ( type ) {
            case 1:
            case 2:
                System.out.println("你好");
                break;
            case 3:
                System.out.println("晚上好");
            case 4:
                System.out.println("再见");
                break;
            default:
                System.out.println("啊？什么啊？");
                break;
        }
    }
}

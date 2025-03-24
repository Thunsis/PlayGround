package fun.func.hello;

import java.util.Scanner;

public class Compare {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("请输入三个数：");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        int max = 0;
        if ( x > y ) {
            if ( x > z) {
                max = x;
            }
            // else 总是和最近的那个if匹配，除非加上大括号，所以永远记得一定要加上大括号
            else {
                max = z;
            }
        } else {
            if ( y > z ) {
                max = y;
            }
            else {
                max = z;
            }
        }
        System.out.println("最大值为："+max);
    }
}

package fun.func.hello;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class PiecewiseFunc {
    public static void main (String[] args) {
        // 级连的if语句
        Scanner in = new Scanner(System.in);
        int y = 0;
        System.out.print("请输入x：");
        int x = in.nextInt();
        if ( x < 0 ) {
            y = -1;
        }
        else if ( x == 0 ) {
            y = 0;
        }
        else {
            y = 1;
        }
        // 单一出口更好
        System.out.println("y="+y);
    }
}

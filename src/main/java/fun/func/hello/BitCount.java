package fun.func.hello;

import java.util.Scanner;

public class BitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        /*
        循环体内要有改变条件的机会
        检查体不是时时刻刻都在进行
        先判断条件再执行
        条件成立是循环继续的条件
         */
//        while (number != 0)
//        {
//            number = number / 10;
//            count ++;
//            System.out.println("number="+number+";count="+count);
//        }
        /*
        进入循环不做检查，执行一轮后再检查
         */
        do {
            number = number / 10;
            count ++;
            System.out.println("number="+number+";count="+count);
        } while (number != 0);
        System.out.println(count);
        // 测试的时候使用边界数：0，10，负数

    }
}

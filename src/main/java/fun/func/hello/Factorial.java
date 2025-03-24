package fun.func.hello;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 表达累积的结果应初始化为1
        int factor = 1;
//        int i = 1;
//        while (i<=n) {
//            factor = factor * i;
//            i++;
//        }
        /*
        1.i的初始化，只有第一轮会执行
        2.进入循环的条件
        3.每轮循环最后的操作（修改循环变量）
        4.若i是在循环内定义的，那么i只在循环内生效
        5.循环括号三要素内容可留空，保留分号
        6.for和while可互相表示 while(条件) = for(;条件;)
        7.只要是for和while循环体一定要跟大括号
         */
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        System.out.println(factor);

        /*
        如果有固定次数，用for
        如果必须执行一次，用do while
        其他情况用while
         */

        /*
        a*=b+6 -> a=a*(b+6)
        i++ -> i=i+1
        ++i -> i=i+1
        a=i++ -> a=i, i++ -> a=6, i=7
        a=++i -> i++. a=i -> a=7, i=7
        建议i++,++i只单独使用，不要复合使用，不然容易出错
         */
    }
}

package fun.func.hello;


import java.util.Scanner;

public class Height {

    public static void main(String[] args) {
        int foot;
        // 整数和整数相除结果为整数，整数和浮点数相除结果为浮点数
        Double inch;
        int height;
        // 浮点数会丢失精度
        System.out.println(1.2-1.1);
        Scanner in = new Scanner(System.in);
        System.out.print("请输入英尺：");
        foot = in.nextInt();
        System.out.print("请输入英寸：");
        inch = in.nextDouble();
        // 把double强制转换为int，只有一个运算对象的运算符叫单目运算符，它的优先级最高，所以(int)后面的一堆括括号
        height = (int)((foot+inch/12)*0.3048*100);
        System.out.println(10/3);
        System.out.println("foot="+foot+";inch="+inch);
        System.out.println("你的身高为："+height+"cm");

        // 判断是否相等的 == 和 != 的优先级比其他的低
        // 整数和浮点数比较时，会把整数转换为浮点数再比较
        System.out.println(5==5.0);
        // 浮点数计算结果会丢失精度，所以两个浮点数是否相等可以通过其差值的绝对值是否小于某个很小的数值来判断
        double a = 1.0;
        double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(a==b);
        System.out.println("a="+a+";b="+b);
        System.out.println(Math.abs(a-b)<1e-6);


    }
}

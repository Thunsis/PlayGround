package fun.func.howAreYou;

public class SumNumbers {

    // 函数是一块代码，接收零个或多个参数，做一件事情，并返回零个或一个值
    // 函数参数类型宽的可以接受窄的，前提是他们有强制转换关系
    public static void sumNumbers (double start, int end) {
        int sum = 0;
        for (double i = start; i < end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void f() // 即使没参数也要加括号
    {
        System.out.println("f()");
    }
    public static int factor (int i) {
        if (i==1) {
            return i;
        } else {
            return i * factor(i - 1);
        }
    }
    public static void main (String[] args) {
        f();
        sumNumbers(1, 10);
        sumNumbers(20, 30);
        sumNumbers(35, 45);
        int k = factor(3);
        System.out.println(k);
        {
            int h =1;
        }
        // 本地变量定义在一个块里面（大括号）
        // 在更大的范围内定义的变量不能在<=这个范围内定义同名变量
    }
}

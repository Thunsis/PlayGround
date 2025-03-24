package fun.func.hello;

import java.util.Scanner;

public class Accumulate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 累加初始值设置为0，累乘初始值设置为1
        double sum = 0;
//        for (int i=1;i<=n;i++) {
//            // 注意这里应该是除以i而不是n
//            if (i%2==0) {
//                sum -= 1.0/i;
//            } else {
//                sum += 1.0/i;
//            }
//        }
        int sign = 1;
        // for 循环条件体的三部份各自的条件用逗号连接（唯一用逗号连接条件的地方）
        for (int i=1;i<=n;i++,sign=-sign) {
            // 注意这里应该是除以i而不是n
            sum += sign*1.0/i;
        }
        System.out.printf("%.2f",sum);
    }
}

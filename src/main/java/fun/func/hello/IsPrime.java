package fun.func.hello;

import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n) {
        Boolean isPrime = true;
        for (int i=2; i<n; i++) {
            if (n%i==0) {
                isPrime = false;
//                    System.out.println(n+"不是素数。");
                // break跳出整个所有循环，continue跳过当轮循环实例的后续语句
                // 都只能对它所在的那一层循环起作用
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int i;
//        for (i=2; i<n&&n%i!=0; i++) {
//        }
//        if (i<n) {
//            System.out.println(n+"不是素数。");
//        } else {
//            System.out.println(n+"是素数。");
//        }
        // 找出100以内的所有素数

        for (int n=2; n<=100; n++) { //1不是素数，所以以2开始
            if (isPrime(n)) {
                System.out.print(n+" ");
            }
        }
        System.out.println();
        // 找出前50个素数
        int count=0;
        int n=2;
        while (count < 50) { //1不是素数，所以以2开始
            Boolean isPrime = true;
            for (int i=2; i<n; i++) {
                if (n%i==0) {
                    isPrime = false;
//                    System.out.println(n+"不是素数。");
                    // break跳出整个所有循环，continue跳过当轮循环实例的后续语句
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
}

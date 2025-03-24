package fun.func.howAreYou;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
//        String s = new String("Hello");
//        System.out.println(s + " World");
//        System.out.println(s + 12);
//        System.out.println(s + 12 + 24);
//        System.out.println(s + (12 + 24));

//        Scanner in = new Scanner(System.in);
//        String x;
//        x = in.nextLine();
//        System.out.println(x);
//        x = in.next();
//        System.out.println(x);
        String s = new String("bye");

        // 判断指向的（管理的）对象是同一个
        System.out.println(s == "bye");
        // 判断内容是否相等
        System.out.println(s.equals("bye"));



    }
}

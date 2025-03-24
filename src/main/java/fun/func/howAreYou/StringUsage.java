package fun.func.howAreYou;

import java.util.Scanner;

public class StringUsage {
    public static void main (String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abb");
        String s3 = new String("abcd");
        String s4 = new String("0123A56389汉字");

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println("abcd".compareTo(s3));
        System.out.println("abcd".length());
        System.out.println("".length());

        System.out.println(s1.charAt(0));
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        for (int i = 0; i < s4.length(); i++) {
            System.out.println(s4.charAt(i));
        }

        // 但是字符串不能用for each循环

        System.out.println(s4.substring(2));
        // 从第一个数字位置开始，到第二个数字位置之前
        System.out.println(s4.substring(2,4));

        System.out.println(s4.indexOf('c'));
        System.out.println(s4.indexOf('2'));
        System.out.println(s4.indexOf("23"));
        int loc = s4.indexOf('3');
        System.out.println(s4.indexOf('3', loc + 1));
        System.out.println(s4.lastIndexOf('3'));
        System.out.println(s4.startsWith("0"));
        System.out.println(s4.trim());

        // 这一类函数不会改变它本身，而是去制造一个新的, 没有手段去直接改变一个字符串的内容
        s1.toUpperCase();
        System.out.println(s1);
        String s5 = s1.toUpperCase();
        System.out.println(s5);


    }
}

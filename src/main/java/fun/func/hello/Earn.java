package fun.func.hello;

import java.util.Scanner;

public class Earn {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextInt();
        double years = in.nextInt();
        double rate = in.nextDouble();
        double circle = years/3;
        while (circle > 0) {
            amount = amount*(1+rate*3);
            circle --;
            System.out.println("amount="+amount+";circle="+circle);
        }
        System.out.println(amount);
    }
}

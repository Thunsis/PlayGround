package fun.func.hello;

import java.util.Scanner;

public class BullsAndCows {
    public static void main (String[] args) {
        // while和do while的条件都是循环得以进行下去的条件而不是循环离开的条件
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100+1); // [0,1) --> [1,100]
        int guess;
        int count = 0;
        do {
            guess = in.nextInt();
            count ++;
            if (guess < number)
            {
                System.out.println("猜小了。");
            }
            else if (guess > number)
            {
                System.out.println("猜大了。");
            }
        } while (guess != number);
        System.out.println("你猜对了"+number+"，共猜了"+count+"次。");
    }
}

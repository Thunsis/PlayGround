package fun.func.hello;

import java.util.Scanner;

public class Avg {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
//        number = in.nextInt();
//        while ( number != -1 ) {
//            sum += number;
//            count ++;
//            number = in.nextInt();
//        }
        do {
            number = in.nextInt();
            if (number != -1)
            {
                sum += number;
                count ++;
            }
        } while ( number != -1 );
        if (count > 0) {
            System.out.println((double) sum / count);
        }
    }
}

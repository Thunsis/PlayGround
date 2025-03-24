package fun.func.howAreYou;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        元素的个数必须提供且必须是整数，可以用变量表示不一定是常量
        元素编号从0开始
        每个元素都是那种类型的变量
         */
        int sum = 0;
        int count = in.nextInt();
//        do {
//            number = in.nextInt();
//            if (number != -1)
//            {
//                sum += number;
//                count ++;
//            }
//        } while ( number != -1 );
        if (count > 0) {
            int[] numbers = new int[count];
            for (int i = 0; i < count; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double avg = (double) sum / count;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > avg) {
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(avg);
        }
    }
}



package fun.func.howAreYou;

import java.util.Scanner;

public class Locate {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3,2,5,7,4,9,11,34,12,28};
        int x = in.nextInt();
        int loc = -1;
        Boolean isExist = false;
        // for-each循环，没有数组下标可以使用，不能修改数组，只能读出数组，适合做遍历取数
        for (int k : data) {
            if (x==k){
                isExist = true;
                break;
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (x == data[i]) {
                loc = i;
                break;
            }
        }
        if (loc > -1) {
            System.out.println(x+"是第"+(loc+1)+"个元素。");
        } else {
            System.out.println(x+"不存在。");
        }

    }
}

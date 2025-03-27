package fun.func.thanks.noteBook;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {

    HashMap<Integer, String> coinMap = new HashMap<Integer, String>();
    // 这是一个面向对象的世界，Integer是int的包裹类型，HashMap的内容需要是对象
    // 一个包裹类型的变量可以直接接收其包裹的基础变量的值

    // HashMap的每条数据由key和value构成，key查找不到会返回null，给同一个key赋值两次以最后一次赋值为准，key之间不可重复且无序

    public Coin() {
        coinMap.put(1, "penny");
        coinMap.put(10, "dime");
        coinMap.put(25, "quarter");
        coinMap.put(50, "half dollar");
        coinMap.put(50, "50 cents");

        System.out.println(coinMap.keySet().size()); // 得到HashMap的所有keys再通过size得到size
        System.out.println(coinMap);

        for (Integer k: coinMap.keySet()) {
            System.out.println(coinMap.get(k));
        }

    }

    public String getName(int amount) {
        if (coinMap.containsKey(amount)) {
            return coinMap.get(amount);
        } else {
            return "Not found";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        System.out.println(coin.getName(amount));


    }
}

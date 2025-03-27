package fun.func.thanks.noteBook;

import java.util.ArrayList;

class SampleClass {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}

public class HashSet {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>();

        java.util.HashSet<String> aSet = new java.util.HashSet<String>();

        aList.add("first");
        aList.add("second");
        aList.add("first");

        aSet.add("first");
        aSet.add("second");
        aSet.add("first");

        for (String s: aList) {
            System.out.println(s);
        }

        System.out.println(aList); // ArrayList有序，可重复

        System.out.println("----------");

        for (String s: aSet) {
            System.out.println(s);
        }

        System.out.println(aSet); // HashSet无序，不可重复

        System.out.println("----------");

        SampleClass a = new SampleClass();
        a.set(10);
        System.out.println(a); // 定义过public String toString()函数后，可直接将对象打印

    }
}

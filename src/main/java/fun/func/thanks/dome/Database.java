package fun.func.thanks.dome;

import java.util.ArrayList;

public class Database {

    private ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(Item item) {
        listItem.add(item);
    }

    public void list() {
        for (Item i: listItem) {
            i.print();
        }
    }

    public static void main(String[] args) {
        Database d = new Database();
        d.add(new CD("CD1", "artist1", 10, 30, true, "..."));
        d.add(new CD("CD2", "artist2", 10, 30, false, "..."));
        d.add(new DVD("DVD1", "director1", 90, true, "..."));
        d.add(new DVD("DVD2", "director2", 120, false, "..."));
        // 类就是一个类型，子类也是子类型的意思，
        // 子类的对象可以被当作父类的对象来使用，
        // 可以赋值给父类的变量，Item v1 = new Item(); Item v2 = new cd(); Item v3 = new dvd();
        // 可以传递给需要父类对象的函数，datebase.add(dvd); datebase.add(cd);
        // 可以放进存放父类对象的容器里，ArrayList<Item>的容器可以放cd也可以放dvd

        // java的对象变量是多态的，可以保存不止一种类型的变量，
        // 变量有静态类型（声明时写的类型）和动态类型，程序执行到这里的时候，不一定存放静态类型的变量，也可能存放声明类型的子类型，
        // 当把子类的对象赋值给静态类型为父类的变量时，就发生了向上造型：把一个类型的对象放进另一个类型的变量
        d.list();

    }



}

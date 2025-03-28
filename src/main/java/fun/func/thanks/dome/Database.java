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
        d.add(new VideoGame("VideoGame1", 2, 10, false, "..."));
        // 代码不需要修改即可适应新的数据，叫可拓展性，修改后可适应新的数据，叫可维护性
        // 类就是一个类型，子类也是子类型的意思，
        // 子类的对象可以被当作父类的对象来使用，
        // 可以赋值给父类的变量，Item v1 = new Item(); Item v2 = new cd(); Item v3 = new dvd();
        // 可以传递给需要父类对象的函数，datebase.add(dvd); datebase.add(cd);
        // 可以放进存放父类对象的容器里，ArrayList<Item>的容器可以放cd也可以放dvd

        // java的对象变量是多态的，可以保存不止一种类型的变量，
        // 变量有静态类型（声明时写的类型）和动态类型，程序执行到这里的时候，不一定存放静态类型的变量，也可能存放声明类型的子类型，
        // 当把子类的对象赋值给静态类型为父类的变量时，就发生了向上造型：把一个类型的对象放进另一个类型的变量
        d.list(); // 怎么print取决于d的动态类型是什么，d是CD，就用CD的print，d是DVD，就用DVD的print，这就是多态

        // 对象和对象之间不能相互赋值
        // 赋值运算符做的事情就是让变量指向了另一个对象，去管理了另一个对象
        // 让变量管理了预期静态类型不符的其他动态变量，即为造型（cast）

        // 子类是父类的子类型
        // 只能把子类的对象赋值为静态类型为父类的变量，但是不能把父类的对象赋值给静态类型为子类的变量
        // 一旦把子类的对象赋值为静态类型为父类的变量，不一定能再将改变量赋值给静态类型为子类的变量
        int i = (int)10.2; // 基本类型的cast为类型转换
        Item item = new Item("item1", 20, false, "...");
        CD cd = new CD("cd", "artist1", 10, 200, true, "...");
        item = (Item) cd; // 对象类型的cast为造型，因为item管理的依旧是cd，实际管理的是cd，print()时会调用cd的print()
        // 子类对象赋值为父类类型变量，为向上造型，默认的，不需要运算符，总是安全的
        // java默认所有的函数调用的绑定都是动态绑定，根据变量的动态类型来绑定




    }



}

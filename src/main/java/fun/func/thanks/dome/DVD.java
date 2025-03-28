package fun.func.thanks.dome;

public class DVD extends Item{

    private String title;
    private String director;

    public DVD(String title, String director, int playTime, Boolean gotIt, String comment) {

        super(title, playTime, gotIt, comment);
        this.title = title;
        // 子类会得到父类所有的成员，当父类成员为private时，可以通过父类的成员函数访问该private变量
        // 当子类具有与父类同名的成员变量时，在哪个类里this.title就指的是谁的title
        setTitle("DVD parent");
        this.director = director;

    }

    @Override
    public void print() {
        System.out.println("子类：" + this.title + ":" + director);
        System.out.println("父类：" + getTitle() + ":" + director);
        super.print();
        // 当子类具有与父类同名的成员函数时，可以使用super调用父类的成员函数
    }

    @Override
    public String toString() {
        return "DVD:" + "title is " + title + ", director is " + director + ", parent class is " + super.toString();
    }

    @Override
    // Override的函数必须满足：函数签名与父类完全一致，权限级别，返回类型，传参类型
    public boolean equals(Object ob) {
        DVD dvd = (DVD) ob;
        return title.equals(dvd.title) && director.equals(dvd.director);
    }

    public static void main(String[] args) {
        DVD dvd = new DVD("DVD sub", "director1", 120, false, "...");
        dvd.print();
        System.out.println(dvd.toString());
    }

    // 所以的类都继承于root object 类，
    // toString() 返回对象的String形式
    // equals() 判断是不是值相等，== 判断是不是指向同一个对象，
    // 但是object的equals()做不到判断无数可能的子类的值，所以它只能判断是不是指向同一个对象
    // 因此这之外的equals()判断需要自己重新实现


}

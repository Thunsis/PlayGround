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

    public static void main(String[] args) {
        DVD dvd = new DVD("DVD sub", "director1", 120, false, "...");
        dvd.print();
    }


}

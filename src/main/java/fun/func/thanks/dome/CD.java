package fun.func.thanks.dome;

public class CD extends Item{

    private String artist;
    private int numOfTrack = 20;

    public CD(String title, String artist, int numOfTrack, int playTime, Boolean gotIt, String comment) {

        super(title, playTime, gotIt, comment);
        // 调用父类的构造器，如果没有调用父类传递参数的构造器，会自动调用父类不带参数的构造器super()
        this.artist = artist;
        this.numOfTrack = numOfTrack;

    }

    @Override
    // 子类成员函数名和父类同名时，使用Override来定义子类的成员函数实现逻辑
    public void print() {
        System.out.println(super.getTitle() + ":" + artist);
    }

    public static void main(String[] args) {

        CD cd = new CD("CD1", "artist1", 10, 30, true, "...");
        // 顺序为 父类的定义初始化 -> 父类的构造初始化 -> 子类的定义初始化 -> 子类的构造初始化
        cd.print();


    }
}

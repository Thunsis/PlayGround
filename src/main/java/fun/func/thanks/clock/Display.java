package fun.func.thanks.clock;

public class Display {
    private int value = 0;
    private int limit = 0;
    private boolean ind = false;
    private static int step = 1;

    public static void f(){

    }

    public Display(int limit){
        this.limit = limit;
    }

    public void increase(){
        value++;
        if (value == limit){
            value = 0;
            ind = true;
        } else {
            ind = false;
        }
    }

    public int getValue(){
        return value;
    }

    public boolean getInd(){
        return ind;
    }

    public static void main(String[] args){
        System.out.println(Display.step); // 1
        Display.step=2;
        System.out.println(Display.step); // 2
        Display d1 = new Display(20);
        Display d2 = new Display(30);
        System.out.println(d1.step); // 2
        System.out.println(d2.step); // 2
        d1.step = 3;
        System.out.println(d1.step); // 3
        System.out.println(d2.step); // 3
        f();
        d1.f();
        d2.f();
        // static 修饰的变量和函数为类变量和类函数，与成员变量和成员函数不同，前者属于类，初始化与类的装载，后者属于对象，初始化于对象的创建，
        // 类变量和类函数可直接通过类名调用访问，且类以及类的所有对象的类变量和类函数均一致


    }
}

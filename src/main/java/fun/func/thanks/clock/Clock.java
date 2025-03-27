package fun.func.thanks.clock;

// 一个.java文件对应一个编译单元，当一个编译单元内有多个类的时候，只能有一个类是public的，且public的类名和文件名必须相同
// 不加public，private，protected，为default，那么只能在同一个包内被访问
// 一个目录下的代码文件同属于一个包，包的名字就是目录的名字，
// 如果要调用包之外的类，需要import packageName.className（class full name）or import packageName.*（不太好，可能重名），
// 也能在代码中直接使用class full name来调用其他包的类
// 包的名字中的点代表目录层级
public class Clock {

    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start(){
        while (true){
            minute.increase();
            if (minute.getInd()) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue()); //注意这里是printf，not println，起到给1补0为01的作用
        }
    }



    public static void main(String[] args) {
        Clock c = new Clock();
        c.start();


    }
}

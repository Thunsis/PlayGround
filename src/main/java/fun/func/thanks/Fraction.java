package fun.func.thanks;

import java.util.Scanner;

public class Fraction {
    private int a;
    private int b;

    Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    void print(){
        if (a == b) {
            System.out.println(1);
        } else {
            System.out.println(a/gcd(a,b) + "/" + b/gcd(a,b));
        }
    }

    Fraction plus(Fraction f){
        return new Fraction(f.a*this.b+this.a*f.b, f.b * this.b);
    } // 一个类的所有不同对象可以互相访问别人的私有对象成员，以为private作用于一个类，而不是一个对象，从代码层面来看（只要对private成员的访问在类的内部即可），不是运行层面来看

    Fraction multiply(Fraction f){
        return new Fraction(f.a*this.a, f.b * this.b);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}

package fun.func.thanks;

import java.util.Scanner;

public class Fraction {
    private int a;
    private int b;

    Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }



    void print(){
        System.out.println();
    }

    Fraction plus(Fraction f){
        return new Fraction(f.a*this.b+this.a*f.b, f.b * this.b);
    }

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
